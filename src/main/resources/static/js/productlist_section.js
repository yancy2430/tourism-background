(function () {
    $('#productlist_section').on('articleload', function () {
        var params = A.Component.params(this);
        console.log(params)
        $("#soText").val(params.key)

        $('.my_filter_conatiner .my_filter_component').on('touchmove', function (e) {
            if ($(e.target).hasClass('my_filter_component')) {
                e.preventDefault();
            }
        });

        var resetView = function () {
            setTimeout(function () {
                $('.my_filter_controller li, .my_filter_conatiner .my_filter_component').removeClass('active');
            }, 100);
        };
        $('.my_filter_c2 li').on(A.options.clickEvent, function () {
            A.showToast('你点击了' + this.innerHTML);
            resetView();
        });
        $('.my_filter_conatiner .my_filter_component').on(A.options.clickEvent, function (e) {
            if ($(e.target).hasClass('my_filter_component')) {
                resetView();
            }
        });

        $('#controller_section').on('sectionhide', function () {
            resetView();
        });

        $('.my_filter_controller li').on(A.options.clickEvent, function () {
            if ($(this).hasClass('active')) {
                resetView()
            } else {
            }
        });

        $('#controller_article').scroll(function () {
            A.Component.lazyload(this);
        });
        $key = $_GET['key'];
        $(".titlebar h1").html($key?decodeURI($key):"")

        A.ajax({
            url: "/api/product/list",
            data:{
                page:$_GET['page']?$_GET['page']:1,
                size:$_GET['size']?$_GET['size']:10,
                cate_id:$_GET['cate_id']?$_GET['cate_id']:0,
            }
            ,type: "get", dataType: "json", success: function (res) {
                for (i = 0; i < res.data.length; i++) {
                    res.data[i].images = JSON.parse(res.data[i].images);
                    res.data[i].productTag = res.data[i].productTag.split("|");
                }
                var html = A.template('#template').render(res);
                $('#list').append(html);
                console.log(res)
            }, error: function (err) {
                console.log(err)
            }
        });


    });


})();