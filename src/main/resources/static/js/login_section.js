$(function () {

    $('#login_article').on('articleload', function () {
        $(".form-common").submit(function () {
            form = $(this);
            var data = {}
            $.each(form.serializeArray(), function (k, field) {
                data[field.name] = field.value;
            })
            A.showMask()
            A.ajax({
                url: "/api/user/login",
                type: "post",
                data: data,
                dataType: "json",
                success: function (res) {
                    if (res.code == 0) {
                        A.hideMask();
                        A.alert("登录成功","",function () {
                            window.location.href = ""
                        })
                    } else {
                        A.hideMask();
                        A.alert("登录失败", res.data)
                    }
                },
                error: function (err) {
                    A.hideMask();
                    A.alert("网络错误", "网络连接异常，请稍后再试")
                }
            });
            return false;
        })
    });
})