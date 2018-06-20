$(function () {

    var package_no = 0;

    $('#product_article').on('scrollInit', function () {

        var scroll = A.Scroll(this);//已经初始化后不会重新初始化，但是可以得到滚动对象

        A.ajax({
            url: "/api/product/item?product_id=" + $_GET['product_id'],
            type: "get",
            dataType: "json",
            success: function (res) {
                console.log(res.data)
                res.data.productinfo.product_tag = res.data.productinfo.product_tag.split("|");
                res.data.productinfo.security = res.data.productinfo.security.split("|");
                for (i = 0; i < res.data.groupdate.length; i++) {
                    var v = res.data.groupdate[i].date.split("-");
                    res.data.groupdate[i].date = v[1] + '-' + v[2]
                }
                var html = A.template('#product').render(res.data);
                $('.product').html(html);
                $('#telephone').data("tel",res.data.productinfo.hotline);

                A.Slider('#slide', {
                    dots: 'right'
                });//得到一个slider组件（其类型为IScroll对象）


                $('.packagelist').find(".placeholder").on(A.options.clickEvent, function () {
                    /* your code*/
                    //可以通过给A添加自定义属性，在事件中获取，比如var id = $(this).data('id');//需要给A添加data-id="XXX"自定义属性
                    $('.packagelist').find(".placeholder").removeClass("select")
                    $(this).addClass("select");
                    package_no = $(this).data("id")
                    console.log(package_no)
                    return false;
                });

                $(".details .tabbar").find(".tab").on(A.options.clickEvent, function () {
                    $(".details .tabbar").find(".tab").removeClass("active")
                    $(this).addClass("active");
                    $(".details .content").find(".item").hide()
                    $("#c"+$(this).data('id')).show()
                    scroll.refresh(); //如果scroll区域dom有改变，需要刷新一下此区域
                    return false;

                });
                $('.packagelist').find(".placeholder:first-child").trigger("click")
                $(".details .tabbar").find(".tab:first-child").trigger("click")


                scroll.refresh(); //如果scroll区域dom有改变，需要刷新一下此区域

            },
            error: function (err) {
                console.log(err)
            }
        });

    })

    $('#telephone').on(A.options.clickEvent, function(){
        A.confirm('提示','立即拨打'+$(this).data("tel")+"咨询?",
            function(){
                A.showToast('你选择了“确定”');
            },
            function(){
                A.alarmToast('你选择了“取消”');
            });
        return false;
    });
    $('#collect').on(A.options.clickEvent, function(){

        A.ajax({
            url: "/api/product/collect?product_id=" + $_GET['product_id'],
            type: "get",
            dataType: "json",
            success: function (res) {
                if(res.data==true){
                    $('#collect').find(".menu-icon").removeClass("iconline-heart")
                    $('#collect').find(".menu-icon").addClass("iconline-heart-fill")
                    $('#collect').find(".menu-text").html("已收藏")
                }else {
                    $('#collect').find(".menu-icon").removeClass("iconline-heart-fill")
                    $('#collect').find(".menu-icon").addClass("iconline-heart")
                    $('#collect').find(".menu-text").html("收藏")

                }
            },
            error: function (err) {
                console.log(err)
            }
        });


        return false;
    });

    $("#todateselect").on(A.options.clickEvent, function(){
        A.Controller.html('date_select_section.html?product_id='+$_GET['product_id']+"&package_no="+package_no)
        return false;
    });

})
