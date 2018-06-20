$(function () {

    $('#all_article').on('articleshow', function () {

        $article = $(this);
        $article.find(".orderlist").html("");

        A.ajax({
            url: "/api/order/list",
            type: "get",
            data:{
                page:1,
                size:10
            },
            dataType: "json",
            success: function (res) {
                console.log(res)
                if (res.code==0){
                    var html = A.template('#order_item').render(res);
                    $article.find(".orderlist").append(html);

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

    })
    $('#dfk_article').on('articleshow', function () {
        var page = 1
        $article = $(this);
        $article.find(".orderlist").html("");
        A.ajax({
            url: "/api/order/list",
            type: "get",
            data:{
                page:page,
                size:10,
                status:0
            },
            dataType: "json",
            success: function (res) {
                console.log(res)
                if (res.code==0){
                    var html = A.template('#order_item').render(res);
                    $article.find(".orderlist").append(html);

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
    })
    $('#clz_article').on('articleshow', function () {
        var page = 1
        $article = $(this);
        $article.find(".orderlist").html("");
        A.ajax({
            url: "/api/order/list",
            type: "get",
            data:{
                page:1,
                size:10,
                status:1
            },
            dataType: "json",
            success: function (res) {
                console.log(res)
                if (res.code==0){
                    var html = A.template('#order_item').render(res);
                    $article.find(".orderlist").append(html);

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
    })
    $('#dcx_article').on('articleshow', function () {
        var page = 1
        $article = $(this);
        $article.find(".orderlist").html("");
        A.ajax({
            url: "/api/order/list",
            type: "get",
            data:{
                page:1,
                size:10,
                status:2
            },
            dataType: "json",
            success: function (res) {
                console.log(res)
                if (res.code==0){
                    var html = A.template('#order_item').render(res);
                    $article.find(".orderlist").append(html);

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
    })
    $('#dpj_article').on('articleshow', function () {

        var page = 1
        $article = $(this);
        $article.find(".orderlist").html("");
        A.ajax({
            url: "/api/order/list",
            type: "get",
            data:{
                page:1,
                size:10,
                status:3
            },
            dataType: "json",
            success: function (res) {
                console.log(res)
                if (res.code==0){
                    var html = A.template('#order_item').render(res);
                    $article.find(".orderlist").append(html);

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
    })
    $('#tk_article').on('articleshow', function () {

        var page = 1
        $article = $(this);
        $article.find(".orderlist").html("");
        A.ajax({
            url: "/api/order/list",
            type: "get",
            data:{
                page:1,
                size:10,
                status:5
            },
            dataType: "json",
            success: function (res) {
                console.log(res)
                if (res.code==0){
                    var html = A.template('#order_item').render(res);
                    $article.find(".orderlist").append(html);

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
    })

    var articlelist = $("header .tabbar").find("a")
    var index  =$_GET['status']?$_GET['status']:0;
    $(articlelist[index]).trigger("click");

})