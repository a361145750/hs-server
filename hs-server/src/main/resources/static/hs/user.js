/**
 * Created by work_tl on 2017/7/11.
 */
function query() {
    console.log("query");
    // param = {number:2,index:0};
    // getUsers(param);
    $('#myTable').bootstrapTable("refresh",{userId: $("#userId").val(),
        userName: $("#userName").val()});
}

function queryParams(params){
    return{
        //每页多少条数据
        pageSize: params.limit,
        //请求第几页
        pageIndex:params.pageNumber,
        userId:$('#userId').val(),
        userName:$('#userName').val()
    }
}

$(function(){
    initTable();
    // param = {number:2,index:0};
    // getUsers(param);
});

function initTable() {
    $('#myTable').bootstrapTable({
        columns: [{
            field: 'userId',
            title: '用户ID',
        }, {
            field: 'userName',
            title: '用户名称',
        }, {
            field: 'role',
            title: '角色',
        },{
            field: 'userRight',
            title: '权限',
        }],//页面需要展示的列，后端交互对象的属性
        method: "post",
        searching: false,
        pagination: true,  //开启分页
        sidePagination: 'server',//服务器端分页
        pageNumber: 1,//默认加载页
        pageSize: 2,//每页数据
        clickToSelect: true, //是否启用点击选中行
        singleSelect: true,
        idField: "userId",
        pageList: "[2, 4, 10, 25, 50, 100, ALL]",//可选的每页数据
        queryParams: function (params) {
            return {
                userId: $("#userId").val(),
                userName: $("#userName").val(),
                pageSize: params.limit,
                offset: params.offset
            }
        },//请求服务器数据时的参数
        responseHandler: function (res) {
            return res.data;
        },
        url: '/api/user/queryUsers' //服务器数据的加载地址
    });
}

function getUsers(param) {
    $.ajax({
        type: "post",
        data:JSON.stringify({pageSize: param.number,
            //请求第几页
            pageIndex:param.index,
            userId:$('#userId').val(),
            userName:$('#userName').val()}),
        url: "/api/user/queryUsers",
        contentType: "application/json;charset=utf-8",
        dataType: "json",
        success: function (res) {
            $("#myTable").bootstrapTable('load', {total:res.data.length,rows:res.data});
        },
        error: function () {
            alert("错误");
        }
    });
}