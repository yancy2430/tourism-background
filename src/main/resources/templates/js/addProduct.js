Array.prototype.indexOf = function (val) {
    for (var i = 0; i < this.length; i++) {
        if (this[i] == val) return i;
    }
    return -1;
};
Array.prototype.remove = function (val) {
    var index = this.indexOf(val);
    if (index > -1) {
        this.splice(index, 1);
    }
};


var E = window.wangEditor
var active;

layui.use(['form', 'layer', 'element', 'laydate', 'laytpl', 'table', 'upload'], function () {
    $ = layui.jquery;
    var form = layui.form
        , layer = layui.layer
        , element = layui.element
        , laydate = layui.laydate
        , laytpl = layui.laytpl
        , table = layui.table
        , upload = layui.upload
    var today = getNowFormatDate();
    var groupDateList = {};

    var selectDate = today;
    var marklist = {}
    //获取套餐信息
    var getPackageList = function () {
        var list = []
        $(".packagelist .package").each(function (i, n) {
            var d = {};
            var c = {};
            var t = $(this).find('#textform').serializeArray();
            $(this).find("input[type='checkbox']:not(:checked)").each(function () {
                d[this.name] = '0';
            });
            $.each(t, function () {
                d[this.name] = this.value;
            });
            var tt = $(this).find('#htmlform').serializeArray();
            $.each(tt, function () {
                c[this.name] = this.value;
            });
            //创建数组
            var t = new Array();
            var p = 0;
            $.each(c, function (key, val) {
                var arr = key.split('|');
                if ('name' == arr[1]) {
                    t[p] = {"name": val};
                    p++;
                }
            });
            //循环添加进去
            var p = 0;
            $.each(c, function (key, val) {
                var arr = key.split('|');
                if ('html' == arr[1]) {
                    t[p]['html'] = val;
                    p++;
                }
            });
            d['content'] = t;
            list[i] = d;
        })


        return list;
    }


    var getformtrip = function () {
        var tripData = new Array();
        $(".triplist .formtrip").each(function (i, n) {

            var list = new Array();
            $(this).find(".formcard").each(function (i, n) {
                var formtrip =  $(this).serializeArray({checkboxUncheckedValue: "false"})
                var d={}
                var img = new Array()
                $.each(formtrip, function () {
                    if(this.name.search("tripimage_")!=-1){
                        img.push(this.value)
                    }else if (this.name.search("type_")!=-1){
                        d['type'] = this.value;
                    }else {
                        d[this.name] = this.value;
                    }
                });
                d['img'] = img
                list.push(d)
            });
            var day ={
                'id':i,
                'name':$(this).find(".day_title").html(),
                'list':list
            }
            tripData.push(day)
        });

        return tripData;

    }
    $("#geta").on("click",function () {
        getformtrip()
    })
    //触发事件
    active = {
        tabAdd: function () {
            //prompt层
            layer.prompt({
                title: '请输入套餐名称', end: function () {
                    element.init();
                    form.render();
                }
            }, function (text, index) {
                var mid = new Date().getTime();
                var data = { //数据
                    "title": "添加区块",
                    "name": text,
                    "package_no": mid,
                    "packageName": 'aa' + mid
                }
                var getTpl = package.innerHTML;
                laytpl(getTpl).render(data, function (html) {
                    element.tabAdd('package', {
                        title: text //用于演示
                        , content: html
                        , id: mid //实际使用一般是规定好的id，这里以时间戳模拟下
                    })
                    tabContentInit('aa' + mid,"费用说明")
                    tabContentInit('aa' + mid,"费用包含")
                    tabContentInit('aa' + mid,"费用")
                    tabContentInit('aa' + mid,"预定须知")
                    element.tabChange('package', mid); //切换到：最新添加的套餐
                    layer.close(index);

                });

            });
        },
        addDayItem:function (day_no) {
            console.log(day_no)

            var mid = new Date().getTime();
            var tript = tripDay.innerHTML;
            laytpl(tript).render({"day_no":day_no,"item_no":mid}, function (html) {
                $("#cardlist-"+day_no).append(html)
            });
            //多图片上传
            upload.render({
                elem: '.day-upload-drag-'+day_no+'-'+mid
                , url: '/uploadfile/image'
                , field: "file"
                , multiple: false
                , done: function (res) {
                    if (res.code == 0) {
                        console.log($(this))
                        $('.day-upload-drag-'+day_no+'-'+mid).parent(".layui-upload-list").find("ul").append('<li> <img src="'+res.data.src+'" class="list"><p class="img_del">删除</p> <input type="hidden" value="'+res.data.src+'" name="tripimage_'+new Date().getTime()+'"></li>')
                    } else {
                        layer.alert("上传失败", {
                            title: '提示'
                        })
                    }

                    $('.img_del').on('click', function () {
                        $(this).parent("li").remove()
                    });
                }
            });
            laydate.render({
                elem: '.datatime-'+day_no+'-'+mid
                ,type: 'time'
                ,format: 'H点m分'
                ,done: function(value, date, endDate){
                    $("#"+'time_'+day_no+'_'+mid).val(value)
                    console.log(value); //得到日期生成的值，如：2017-08-18
                }
            });
            element.init();
            form.render();
        },
        tabAddDay: function () {
            var mid = new Date().getTime();
            //prompt层
            layer.prompt({
                title: '请输入行程名称', end: function () {
                    form.render();
                }
            }, function (text, index) {
                var data = { //数据
                    "day_no": mid,
                    "text": text,
                }
                var tripTpl = trip.innerHTML;
                laytpl(tripTpl).render(data, function (html) {
                    element.tabAdd('trip', {
                        title: text //用于演示
                        , content: html
                        , id: mid //实际使用一般是规定好的id，这里以时间戳模拟下
                    })
                    element.tabChange('trip', mid); //切换到：最新添加的套餐
                    layer.close(index);
                });
            });
        },
        initGroupDateList: function () {
            var da = getPackageList();
            for (var key in groupDateList) {
                for (var i in groupDateList[key]) {
                    var is = false;
                    for (var s in da) {
                        if (groupDateList[key][i].package_name != null && groupDateList[key][i].package_name != 'undefined' && groupDateList[key][i].package_name == da[s].package_name) {
                            is = true;
                            break;
                        }
                    }
                    if (is) {
                        continue;
                    } else {
                        groupDateList[key].remove(groupDateList[key][i])
                    }
                }
            }
        },
        deldate: function () {
            groupDateList[selectDate] = null;
            active.showGroupDate();
            //显示日历
            active.showDateWin()
        },
        adddate: function () {
            var da = getPackageList();
            var datalist = {};
            try {
                var priceData = groupDateList[selectDate];
                for (i = 0; i < da.length; i++) {
                    try {
                        datalist[da[i].package_no] = {
                            package_no: da[i].package_no,
                            day: selectDate,
                            package_name: da[i].package_name,
                            adult_price: priceData[i].adult_price ? priceData[i].adult_price : "",
                            children_price: priceData[i].children_price ? priceData[i].children_price : "",
                            housing_price: priceData[i].housing_price ? priceData[i].housing_price : ""

                        }
                    } catch (e) {
                        datalist[da[i].package_no] = {
                            package_no: da[i].package_no,
                            day: selectDate,
                            package_name: da[i].package_name,
                            adult_price: "",
                            children_price: "",
                            housing_price: ""
                        }
                    }
                }
            }
            catch (e) {
                for (i = 0; i < da.length; i++) {
                    datalist[da[i].package_no] = {
                        package_no: da[i].package_no,
                        day: selectDate,
                        package_name: da[i].package_name,
                        adult_price: "",
                        children_price: "",
                        housing_price: ""
                    }
                }
            }


            var data = { //数据
                "title": "添加团期",
                "packagelist": datalist
            }
            laytpl(adddate.innerHTML).render(data, function (html) {
                layer.open({
                    type: 1,
                    btn: ['添加', '取消'],
                    area: ['620px'], //宽高
                    content: html,
                    yes: function (index, layero) {
                        var checkStatus = table.checkStatus('getDateList')
                            , data = checkStatus.data;
                        var obj = {}
                        groupDateList[selectDate] = data;
                        // dateList
                        form.render();
                        layer.close(index);
                        active.showGroupDate();
                        // console.log(groupDateList)
                        //显示日历
                        active.showDateWin()
                    }
                });
                table.init('parse-table', { //转化静态表格
                    id: 'getDateList'
                });
                //监听单元格编辑
                table.on('edit(parse-table)', function (obj) {
                    var value = obj.value //得到修改后的值
                        , data = obj.data //得到所在行所有键值
                        , field = obj.field; //得到字段
                });

            });


        },
        showGroupDate: function () {
            //展示已知数据

            table.render({
                elem: '#showGroupDate'
                , cols: [[ //标题栏
                    {field: 'teamtime', title: '开团日期', width: 130}
                    , {field: 'package_name', title: '套餐名称', minWidth: 200}
                    , {field: 'adult_price', title: '成人价', width: 120}
                    , {field: 'children_price', title: '儿童价', width: 120}
                    , {field: 'housing_price', title: '单房差', width: 120}

                ]]
                , data: groupDateList[selectDate]
                //,skin: 'line' //表格风格
                , even: true
                //,page: true //是否显示分页
                //,limits: [5, 7, 10]
                //,limit: 5 //每页默认显示的数量
            });
        }, showDateWin: function () {

            marklist = {};
            $.each(groupDateList, function (k, v) {
                if (null != v) {
                    var arr = k.split('-');
                    marklist[k] = arr[2] + "<p>￥" + ((v[0].adult_price).replace('.00', "")) + "</p>"
                    console.log(marklist[k])
                }
            })
            $("#test-n1").html("")
            //直接嵌套显示
            laydate.render({
                elem: '#test-n1'
                , position: 'static'
                , value: selectDate
                // ,range: true
                , change: function (value, date) { //监听日期被切换
                    selectDate = value
                    active.showGroupDate();
                }
                , showBottom: true
                , mark: marklist
            });
        }, addDatelist: function () {

            var da = getPackageList();
            var datalist = {};
            for (i = 0; i < da.length; i++) {
                datalist[da[i].package_no] = {
                    package_no: da[i].package_no,
                    day: selectDate,
                    package_name: da[i].package_name,
                    adult_price: "",
                    children_price: "",
                    housing_price: ""
                }
            }
            var data = { //数据
                "title": "批量添加团期",
                "packagelist": datalist
            }
            laytpl(adddatelistview.innerHTML).render(data, function (html) {
                console.log(html)
                $("#adddatesview").html(html)
                layer.open({
                    type: 1,
                    btn: ['添加', '取消'],
                    area: ['620px'], //宽高
                    content: $('.adddatelist'), //捕获的元素，注意：最好该指定的元素要存放在body最外层，否则可能被其它的相对元素所影响
                    yes: function (index, lay) {


                        var checkStatus = table.checkStatus('getBatchlist')

                        var obj = {}

                        for (i = 0; i < batchlist.length; i++) {
                            var data = checkStatus.data;
                            var b = new Array();
                            for (j = 0; j < data.length; j++) {
                                var a = data[j];
                                a.teamtime = batchlist[i]
                                b.push(a)
                            }
                            groupDateList[batchlist[i]] = JSON.parse(JSON.stringify(b));
                        }
                        form.render();
                        active.showGroupDate();
                        //显示日历
                        active.showDateWin()
                        layer.close(index);
                    },
                    cancel: function (index) {

                        layer.close(index);
                    }
                });

                //日期范围
                laydate.render({
                    elem: '#test6'
                    , range: true
                    , showBottom: true
                    , change: function (value, date) { //监听日期被切换
                        var arr = value.split(' - ');
                        batchlist = getAll(arr[0], arr[1])
                    }
                });
                table.init('parse-batchlist', { //转化静态表格
                    id: 'getBatchlist'
                });
                //监听单元格编辑
                table.on('edit(parse-table)', function (obj) {
                    var value = obj.value //得到修改后的值
                        , data = obj.data //得到所在行所有键值
                        , field = obj.field; //得到字段
                });

            });


        }
    };

    var images = []
    //多图片上传
    upload.render({
        elem: '#upimages'
        , url: '/uploadfile/image'
        , field: "file"
        , multiple: false
        , before: function (obj) {
            //预读本地文件示例，不支持ie8
            // obj.preview(function(index, file, result){
            //     $('#demo2').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img">')
            // });
        }
        , done: function (res) {
            if (res.code == 0) {
                images.push(res.data.src)
                $('#imagelist').append('<li style="float: left;"><img src="' + res.data.src + '" alt="' + res.data.src + '" class="layui-upload-img"><p class="img_del" data-url="' + res.data.src + '">删除</p></li>')

            } else {
                layer.alert("上传失败", {
                    title: '提示'
                })
            }
            $('.img_del').on('click', function () {
                $(this).parent("li").remove()
                images.remove($(this).data("url"))
            });
        }
    });
    $('.img_del').on('click', function () {
        $(this).parent("li").remove()
        images.remove($(this).data("url"))
    });
    $('.site-package-active').on('click', function () {
        var othis = $(this), type = othis.data('type');
        active[type] ? active[type].call(this, othis) : '';
    });
    $('.site-trip-active').on('click', function () {
        var othis = $(this), type = othis.data('type');
        active[type] ? active[type].call(this, othis) : '';
    });
    $('.site-content-active').on('click', function () {
        var othis = $(this), type = othis.data('type');
        active[type] ? active[type].call(this, othis) : '';
    });
    $('.site-date-active').on('click', function () {
        var othis = $(this), type = othis.data('type');
        active[type] ? active[type].call(this, othis) : '';
    });

    //获取产品分类
    reqGet("admin/product/getProductCateList", {
        page: 1,
        limit: 100
    }, function (res) {
        for (i = 0; i < res.data.length; i++) {
            $("#product_cate").append('<option value="' + res.data[i].cateId + '">' + res.data[i].cateName + '</option>');
        }
        form.render();
    })

    //团期管理


    //显示日历
    active.showDateWin()

    active.showGroupDate();


    //监听提交
    form.on('submit(addproduct)', function (data) {
        var productinfo = $("#productinfo").serializeArray({checkboxUncheckedValue: "false"})

        var info = {}
        $("#productinfo input[type='checkbox']:not(:checked)").each(function () {
            info[this.name] = '0';
        });
        $.each(productinfo, function () {
            info[this.name] = this.value;
        });
        info['images'] = images
        var packageList = getPackageList();

        //转换结构
        var groupdate = new Array();
        $.each(groupDateList, function (k, v) {
            if (null != v && "" != v) {
                groupdate.push({'date': k, 'list': v})
            }
        })
        var product_cate_name = $("#product_cate").find("option:selected").text();
        info['product_cate_name'] = product_cate_name;
        var formtrip = getformtrip();
        var obj = {productinfo: info, packagelist: packageList, groupdate: groupdate,tripInfo:JSON.stringify(formtrip)};
        jsonstr = JSON.stringify(obj);
        var index = layer.load(2);
        reqPost("admin/product/addproduct", {product: jsonstr}, function (res) {
            console.log(res)
            layer.close(index);
            if (res.code == 0) {
                layer.alert(res.msg, {
                    title: '提示',
                    icon: 6
                }, function () {
                    localStorage.removeItem('inputData')
                    x_admin_close();
                })
            } else {
                layer.alert(res.msg, {
                    title: '提示',
                    icon: 5
                })
            }


        }, function (e) {
            layer.alert(e, {
                title: '提示',
                icon: 5
            })
        })
        return false;
    });



    var E = window.wangEditor
    var contentEditor = new E('#content')
    var $text = $('#content_text')
    contentEditor.customConfig.onchange = function (html) {
        // 监控变化，同步更新到 textarea
        $text.val(html)
    }
    // 配置服务器端地址
    contentEditor.customConfig.uploadImgShowBase64 = true   // 使用 base64 保存图片
    contentEditor.create()


    var json = localStorage.getItem("inputData");
    var localdata = JSON.parse(json)
    if (null != json && '' != json && "null" != json) {
        //配置一个透明的询问框
        layer.msg('有未保存输入数据，是否恢复？', {
            time: 20000, //20s后自动关闭
            btn: ['恢复', '取消'],
            yes: function (index, layero) {
                //恢复productinfo
                $("input[name='product_no']").val(localdata.productinfo.product_no)
                $("input[name='product_name']").val(localdata.productinfo.product_name)
                // $("input[name='product_cate']").val('国内游')
                $("#product_cate").find("option[value=" + localdata.productinfo.product_cate + "]").attr("selected", true);
                $("input[name='product_tag']").val(localdata.productinfo.product_tag)
                $("input[name='principal']").val(localdata.productinfo.principal)
                $("textarea[name='sketch']").val(localdata.productinfo.sketch)
                $("input[name='hotline']").val(localdata.productinfo.hotline)
                if (localdata.productinfo.notmobile == 1)
                    $("input[name='notmobile']").attr("checked", "checked");

                $("textarea[name='operate']").val(localdata.productinfo.operate)
                $("textarea[name='desc']").val(localdata.productinfo.desc)
                $("#content_text").val(localdata.productinfo.content)
                contentEditor.txt.html(localdata.productinfo.content)

                if (localdata.productinfo.isshow == 1)
                    $("input[name='isshow']").attr("checked", "checked");

                //恢复图片上传
                images = localdata.productinfo.images
                $.each(images, function (k, v) {
                    $('#imagelist').append('<li style="float: left;"><img src="' + v + '" alt="' + v + '" class="layui-upload-img"><p class="img_del" data-url="' + v + '">删除</p></li>')
                })

                $('.img_del').on('click', function () {
                    $(this).parent("li").remove()
                    images.remove($(this).data("url"))
                });
                //恢复套餐模块
                $.each(localdata.packagelist, function (index, value) {
                    console.log(index + "==" + value.package_no)

                    var mid = new Date().getTime();
                    var data = { //数据
                        "title": "添加区块",
                        "name": value.package_name,
                        "package_no": value.package_no,
                        "packageName": 'aa' + value.package_no,
                        "isshow": value.isshow,
                        "notchildren": value.notchildren,
                    }


                    var getTpl = package.innerHTML;
                    laytpl(getTpl).render(data, function (html) {
                        element.tabAdd('package', {
                            title: value.package_name //用于演示
                            , content: html
                            , id: value.package_no //实际使用一般是规定好的id，这里以时间戳模拟下
                        })
                        element.tabChange('package', value.package_no); //切换到：最新添加的套餐
                        layer.close(index);

                    });
                    $.each(value.content, function (index, value) {

                        var amid = new Date().getTime();
                        var str = data.packageName
                        element.tabAdd(str, {
                            title: value.name //用于演示
                            ,
                            content: '<div id="aa' + str + amid + '">' + value.html + '</div><input style="display: none" name="' + str + '|name|' + amid + '" value="' + value.name + '"><textarea style="display: none" id="text' + str + amid + '" name="' + str + '|html|' + amid + '" style="width:100%; height:200px;">' + value.html + '</textarea>'
                            ,
                            id: amid //实际使用一般是规定好的id，这里以时间戳模拟下
                        })
                        var editor = new E('#aa' + str + amid)
                        var $text1 = $('#text' + str + amid)
                        editor.customConfig.onchange = function (html) {
                            // 监控变化，同步更新到 textarea
                            $text1.val(html)
                        }
                        editor.customConfig.uploadImgShowBase64 = true   // 使用 base64 保存图片
                        editor.create()
                        element.tabChange(str, amid); //切换到：最新添加的套餐
                    })
                })

                //恢复团期数据

                $.each(localdata.groupdate, function (k, v) {
                    groupDateList[v.date] = v.list
                })

                active.showGroupDate();
                //显示日历
                active.showDateWin()


                element.init();
                form.render();
                layer.close(index)
            },
            btn2: function (index, layero) {
                localStorage.removeItem('inputData')
            }
        });
    }




    //每十秒钟保存一次临时输入数据
    ref = setInterval(function () {
        try {
            var productinfo = $("#productinfo").serializeArray({checkboxUncheckedValue: "false"})
            var info = {}
            $("#productinfo input[type='checkbox']:not(:checked)").each(function () {
                info[this.name] = '0';
            });
            $.each(productinfo, function () {
                info[this.name] = this.value;
            });
            info['images'] = images
            var packageList = getPackageList();

            //转换结构
            var groupdate = new Array();
            $.each(groupDateList, function (k, v) {
                if (null != v && "" != v) {
                    groupdate.push({'date': k, 'list': v})
                }
            })
            var product_cate_name = $("#product_cate").find("option:selected").text();
            info['product_cate_name'] = product_cate_name;
            var formtrip = getformtrip();
            var obj = {productinfo: info, packagelist: packageList, groupdate: groupdate,tripInfo:formtrip};
            jsonstr = JSON.stringify(obj);
            localStorage.setItem("inputData", jsonstr);
        } catch (e) {

        }
    }, 10000);
});


var arr = new Array();

function tabContentAdd(str) {
//prompt层
    layer.prompt({
        title: '请输入区块名称'
    }, function (text, index) {
        tabContentInit(str,text);
        layer.close(index);
    });
}
function tabContentInit(str,text) {
    var amid = new Date().getTime();
    element.tabAdd(str, {
        title: text //用于演示
        ,
        content: '<div id="aa' + str + amid + '"></div><input style="display: none" name="' + str + '|name|' + amid + '" value="' + text + '"><textarea style="display: none" id="text' + str + amid + '" name="' + str + '|html|' + amid + '" style="width:100%; height:200px;"></textarea>'
        ,
        id: amid //实际使用一般是规定好的id，这里以时间戳模拟下
    })
    var editor = new E('#aa' + str + amid)
    var $text1 = $('#text' + str + amid)
    editor.customConfig.onchange = function (html) {
        // 监控变化，同步更新到 textarea
        $text1.val(html)
    }
    // 配置服务器端地址
    editor.customConfig.uploadImgShowBase64 = true   // 使用 base64 保存图片
    // editor.customConfig.uploadImgServer = '/admin/upload'
    editor.create()
    element.tabChange(str, amid); //切换到：最新添加的套餐


}

/**
 * 获取当前日期
 * @returns {string}
 */
function getNowFormatDate() {
    var date = new Date();
    var seperator1 = "-";
    var year = date.getFullYear();
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdate = year + seperator1 + month + seperator1 + strDate;
    return currentdate;
}

Date.prototype.format = function () {
    var s = '';
    // 获取年份。
    s += this.getFullYear() + '-';
    if (this.getMonth() >= 1 && this.getMonth() <= 9) {
        s += "0" + (this.getMonth() + 1) + "-";
    } else {
        s += (this.getMonth() + 1) + "-";
    }

    if (this.getDate() >= 0 && this.getDate() <= 9) {
        s += "0" + this.getDate();
    } else {
        s += this.getDate();
    }
    return (s);                          // 返回日期。
};

function getAll(begin, end) {
    var arr = new Array();
    var ab = begin.split("-");
    var ae = end.split("-");
    var db = new Date();
    db.setUTCFullYear(ab[0], ab[1] - 1, ab[2]);
    var de = new Date();
    de.setUTCFullYear(ae[0], ae[1] - 1, ae[2]);
    var unixDb = db.getTime();
    var unixDe = de.getTime();
    for (var k = unixDb; k <= unixDe;) {
        arr.push((new Date(parseInt(k))).format())
        k = k + 24 * 60 * 60 * 1000;
    }
    return arr;
}

function addDayItem(id) {
    // alert("a")
    active.addDayItem(id)
}

function editPackageName() {
    alert("A")
}