$(function () {



    $('#calendar_article').on('articleload', function () {


        $(".order_info .product_info").html(decodeURI($_GET['product_name']))
        $("#datetime").html($_GET['datetime'])
        $("#adultNum").html($_GET['adultNum'])
        $("#childrenNum").html($_GET['childrenNum'])

        var number =Number($_GET['adultNum'])+Number($_GET['childrenNum']);
        console.log(number)
        $("#number_people").html("")
        var html = A.template('#identity').render({num:number});
        $("#number_people").html(html)

        $(".form-common").submit(function () {
            form = $(this);
            var data = {}
            $.each(form.serializeArray(),function (k,field) {
                if (field.name=='username' || field.name=='userIdcard'){
                    if(!data.hasOwnProperty(field.name)){
                        data[field.name]=[];
                    }
                    data[field.name].push(field.value)
                }else {
                    data[field.name]=field.value;
                }
            })

            data['product_name'] = decodeURI($_GET['product_name'])
            data['product_id'] = $_GET['product_id']
            data['package_no'] = $_GET['package_no']
            data['datetime'] = $_GET['datetime']
            data['adultNum'] = $_GET['adultNum']
            data['childrenNum'] = $_GET['childrenNum']
            data['singleNum'] = $_GET['singleNum']
            A.ajax({
                url: "/api/product/addOrder",
                type: "post",
                data:{reqData:JSON.stringify(data)},
                dataType: "json",
                success: function (res) {
                    if (res.code==0){
                        A.hideMask();
                        A.Controller.html('place_order_succeed_section.html?order_id='+res.data);
                    }else {
                        A.hideMask();
                        A.alert("下单失败",res.msg)
                    }
                },
                error: function (err) {
                    A.hideMask();
                    A.alert("网络错误","网络连接异常，请稍后再试")
                }
            });
            return false;
        })

    })


    
})