// We need to use custom DOM library, let's save it to $$ variable:
var pageSize = 3;
var $$ = Dom7;

var myApp = new Framework7({
    precompileTemplates: true,
    onPageInit: function (app, page) {
        if (page.name === 'userlist') {
            queryUsers({offset:0, pageSize: pageSize}, false);
        }
    }
});

myApp.userResultsTemplate = Template7.compile($$('#userlist-template').html());

// Add view
var mainView = myApp.addView('.view-main', {
    dynamicNavbar: true
});

var ptrContent = $$('.pull-to-refresh-content');

ptrContent.on('refresh', function (e) {
    setTimeout(function () {
        queryUsers({offset:0, pageSize: pageSize}, false);
        myApp.pullToRefreshDone();
    }, 1000);
});

var offset = pageSize;
var loading = false;
$$('.infinite-scroll').on('infinite', function () {
    if (loading) return;
    loading = true;
    setTimeout(function () {
        loading = false;
        queryUsers({offset:offset, pageSize: pageSize}, true);
    }, 1000);
});

var mySearchbar = myApp.searchbar('.searchbar', {
    customSearch: true,
    onSearch: function (s) {
        queryUsers({offset:0, pageSize: pageSize, query: s.query}, false);
    }
});

function queryUsers(param, isAppend){
    var data = JSON.stringify(param);
    $$.ajax(
        {
            url: '/api/user/queryUsers',
            data: data,
            method: 'POST',
            async: true,
            dataType: 'json',
            contentType: 'application/json',
            success: function (result) {
                var html = '';
                if (result.data.rows.length > 0) {
                    var users = result.data.rows;
                    html = myApp.userResultsTemplate(users);
                }
                if(isAppend){
                    $$('#userresult').append(html);
                    if(html && html != ''){
                        offset = offset + pageSize;
                    }
                } else {
                    $$('#userresult').html(html);
                }
            }
        }
    );
}