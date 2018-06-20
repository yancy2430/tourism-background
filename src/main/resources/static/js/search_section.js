$(function () {
    var $searchBar = $('#searchBar'),
        $searchResult = $('#searchResult'),
        $searchText = $('#searchText'),
        $searchInput = $('#searchInput'),
        $searchClear = $('#searchClear'),
        $searchCancel = $('#searchCancel');
        $selectKey = $('#selectKey');

    function hideSearchResult() {
        $searchResult.hide();
        $searchInput.val('');
        $selectKey.show();
    }
    $searchText.on('click', function () {
        $searchBar.addClass('weui-search-bar_focusing');
        $searchInput.focus();
    });
    $searchInput.on('input', function () {
        if (this.value.length) {
            $searchResult.show();
            $selectKey.hide();
        } else {
            $searchResult.hide();
            $selectKey.show();
        }
    });
    $searchClear.on('click', function () {
        hideSearchResult();
        $searchInput.focus();
    });
    $searchCancel.on('click', function () {
        // cancelSearch();
        // $searchInput.blur();
        /** @namespace A.Controller */
        A.showToast('你点击了'+this.innerHTML);
        A.Controller.back();
    });
    $searchInput.bind('keypress',function(event){
        if(event.keyCode == 13)
        {
            // alert('你输入的内容为：' + $searchInput.val());
            return false;
        }

    });

    $(".keys").find(".placeholder").on("click",function (ev) {
        var key = $(this).html();
        $searchInput.val(key)

        A.Controller.html("productlist_section.html?key="+key)
        // alert('你输入的内容为：' + $(this).html());
    })

    $searchResult.find(".weui-cell_access").on("click",function (ev) {
        var key = $(this).find("p").html();
        $searchInput.val(key)
        A.Controller.html('productlist_section.html?key='+key)

    })

});