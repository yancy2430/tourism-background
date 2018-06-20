
(function () {
    var calendar_calendar = null;

    var today = getNowFormatDate();

    var html = '';
    var adultNum = 1;
    var childrenNum = 0;
    var singleNum = 0;
    var package_no = 0;
    var gdate = {};
    function showCalendar(_val,groupdate) {

        if (_val) {
            var marklist = {}


            for (i=0;i<groupdate.length;i++){
                var d = {}
                for (j=0;j<groupdate[i].list.length;j++){
                    d[groupdate[i].list[j].package_no] = groupdate[i].list[j]
                    groupdate[i].list[groupdate[i].list[j].package_no]=groupdate[i].list[j]
                }
                marklist[groupdate[i].date] = {
                    'bottom': {
                        content: '￥'+groupdate[i].list[0].adult_price.replace(".00",""),
                        class: 'hoilday'
                    },
                    hideCount: true
                }
                gdate[groupdate[i].date] =groupdate[i];

                groupdate[i].list = d
            }

            calendar_calendar = A.Calendar("#calendar_calendar", {
                row: _val,
                autoJump: _val > 8 ? false : true,
                marks: marklist

            });
            calendar_calendar.onChange(function (data) {
                console.log(data);
                if (calendar_calendar.opts.selectedDateString) {
                    $('#datapicker_label').html(calendar_calendar.opts.selectedDateString);
                    $('#datapicker').val(calendar_calendar.opts.selectedDateString);
                } else {
                    $('#datapicker_label').html('点此跳转');
                    $('#datapicker').val('');
                }
            })
            A.Scroll("#calendar_article", {}).refresh();
        }
    }


    $('#calendar_article').on('articleload', function () {



        var datapicker = A.Datepicker();
        package_no = $_GET['package_no'];

        A.ajax({
            url: "/api/product/item?product_id=" + $_GET['product_id'],
            type: "get",
            dataType: "json",
            success: function (res) {
                showCalendar(5,res.data.groupdate);
                $('#control_panel').on(A.options.clickEvent, function() {
                    var _date=null,
                        _date_string_array=$('#datapicker').val().split('-');

                    if(_date_string_array.length==3){
                        _date=new Date(_date_string_array[0],parseInt(_date_string_array[1])-1,_date_string_array[2]);
                    }else{
                        _date=new Date();
                    }

                    datapicker.select(_date,function(data){
                        var _date=data.date,
                            _date_string = data.dateString;
                        $('#datapicker').val(_date_string);
                        $('#datapicker_label').html(_date_string);
                        calendar_calendar.goto(data.date);
                    });
                });
                var datapicker = A.Datepicker();
                $(".calendar_tbody").find(".calendar_td").on(A.options.clickEvent,function () {
                    today = getNowFormatDate($(this).find(".calendar_DF_font").data("day"));

                    imputedPrice()
                })
                $("#adult .num").html(adultNum)
                $("#adult .sub").on(A.options.clickEvent,function () {
                    adultNum = adultNum-1<0?0:adultNum-1;
                    $("#adult .num").html(adultNum)
                    imputedPrice();
                })
                $("#adult .add").on(A.options.clickEvent,function () {
                    adultNum = adultNum+1;
                    $("#adult .num").html(adultNum)
                    imputedPrice();
                })


                $("#children .num").html(childrenNum)
                $("#children .sub").on(A.options.clickEvent,function () {
                    childrenNum = childrenNum-1<0?0:childrenNum-1;
                    $("#children .num").html(childrenNum)
                    imputedPrice();
                })
                $("#children .add").on(A.options.clickEvent,function () {
                    childrenNum = childrenNum+1;
                    $("#children .num").html(childrenNum)
                    imputedPrice();
                })

                $("#single .num").html(singleNum)
                $("#single .sub").on(A.options.clickEvent,function () {
                    singleNum = singleNum-1<0?0:singleNum-1;
                    $("#single .num").html(singleNum)
                    imputedPrice();
                })
                $("#single .add").on(A.options.clickEvent,function () {
                    singleNum = singleNum+1;
                    $("#single .num").html(singleNum)
                    imputedPrice();
                })


                $("#place_order").on(A.options.clickEvent,function () {
                    A.Controller.html('place_order_section.html?product_id='+$_GET['product_id']+"&package_no="+package_no+"&datetime="+today+"&adultNum="+adultNum+"&childrenNum="+childrenNum+"&singleNum="+singleNum+"&product_name="+res.data.productinfo.product_name)

                })

                imputedPrice()

            },
            error: function (err) {
                console.log(err)
            }
        });



    });
    
    
    function imputedPrice() {

        // console.log(gdate[today])
        var priceTotal = 0;
        console.log(gdate[today].list[package_no])
        $("#adult>div>p>span").html("￥"+gdate[today].list[package_no].adult_price)
        $("#children>div>p>span").html("￥"+gdate[today].list[package_no].children_price)
        $("#single>div>p>span").html("￥"+gdate[today].list[package_no].housing_price)


        priceTotal = priceTotal+(gdate[today].list[package_no].adult_price*adultNum)
        priceTotal = priceTotal+(gdate[today].list[package_no].children_price*childrenNum)
        priceTotal = priceTotal+(gdate[today].list[package_no].housing_price*singleNum)

        console.log(priceTotal)
        $(".menubar .price").html("￥"+priceTotal)
    }
    function getNowFormatDate(data) {
        var date =null;
        if (null!=data && "undefined"!=data){
            date = new Date(Date.parse(data.replace(/-/g, "/")))
        }else {
            date = new Date();
        }
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


})();