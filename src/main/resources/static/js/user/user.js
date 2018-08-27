
//搜索用户
function searchUser() {
    var status = $('#userStatus option:selected') .val();
    var keyword = $("input[name='keyword']").val();
    $.ajax({
        url: "/user/queryUserByKeyword",
        data: {status: status,keyword:keyword},
        type: "post",
        dataType: "json",
        success: function (msg) {
            $('#usertable').bootstrapTable('load', msg);
            $(".pull-left.pagination-detail .pagination-info").empty();
            $(".pull-left.pagination-detail .pagination-info").html("共 "+msg.length+" 条记录 ");
            $("#usertable").bootstrapTable('hideLoading');
        },
        error: function () {
            toastr.error("数据加载失败!");
        }
    })
}

//搜索全部用户
function searchAllUser() {
    debugger
    $("select option[value='']").attr("selected", "selected");
    $("input[name='keyword']").val("");
    $.ajax({
        url: "/user/queryUserByKeyword",
        type: "post",
        dataType: "json",
        success: function (msg) {
            $('#usertable').bootstrapTable('load', msg);
            $(".pull-left.pagination-detail .pagination-info").empty();
            $(".pull-left.pagination-detail .pagination-info").html("共 "+msg.length+" 条记录 ");
            $("#usertable").bootstrapTable('hideLoading');
        },
        error: function () {
            toastr.error("数据加载失败!");
        }
    })
}

//删除用户
function deleteUser() {
    var lgcSn = $("input[name='lgcSn']").val();
    $.ajax({
        url: "/user/deleteUser",
        data: {lgcSn: lgcSn},
        type: "post",
        dataType: "text",
        success: function (result) {
            if (JSON.parse(result).state == "true") {
                toastr.success("保存成功!");
            } else {
                toastr.error("保存失败!");
            }
            loaddata();
        }
    })
}



//编辑用户
function editUser() {
    var usrMobi = $("input[name='userMobile']").val();
    var usrNm = $("input[name='userName']").val();
    var departName = $("input[name='departName']").val();
    var lgcSn = $("input[name='lgcSn']").val();
    var status = $('input[name="status"]:checked').val();
    var usrMail = $("input[name='userEmail']").val();
    $(":radio[name='status'][value='" + status + "']").prop("checked", "checked");
    $.ajax({
        url: "/user/editUser",
        data: {usrMobi: usrMobi,usrNm:usrNm,departName:departName,
            status: status,lgcSn:lgcSn,usrMail:usrMail},
        type: "post",
        dataType: "text",
        success: function (result) {
            if (JSON.parse(result).state == "true") {
                toastr.success("保存成功!");
            } else {
                toastr.error("保存失败!");
            }
            loaddata();
        },
    })

}
/**
 * 新增用户
 */
function addUser(){
    var usrAcnt = $("input[name='userAccount']").val();
    var usrMobi = $("input[name='userMobile']").val();
    var usrNm = $("input[name='userName']").val();
    var departName = $("input[name='departName']").val();
    var status = $('input[name="status"]:checked').val();
    var usrMail = $("input[name='userEmail']").val();
    $.ajax({
        url: "/user/saveUser",
        data: {usrAcnt: usrAcnt, usrMobi: usrMobi,
            usrNm: usrNm,departName:departName,status:status,usrMail:usrMail},
        type: "post",
        dataType: "text",
        success: function (result) {
            if (JSON.parse(result).state == "true") {
                toastr.success("保存成功!");
            } else {
                toastr.error("保存失败!");
            }
            loaddata();
        },
    })
}

function loadtable() {
    $("#usertable").bootstrapTable({
        classes: 'table table-hover mb-0',
        // striped: true,
        pagination: true,
        pageNumber: 1,
        pageSize: 10,
        pageList: [5, 10, 20, 30],
        fit: true,
        // toolbar: '#toolbar',
        // search: true,
        // showRefresh: true,
        sortName: "lgcSn",
        sortOrder: "desc",
        columns: [{
            field: 'lgcSn',
            title: '序号',
            align: 'center',
            width: '100',
            // switchable: true
        }, {
            field: 'usrAcnt',
            title: '帐号',
            align: 'center',
            width: '100',
        }, {
            field: 'usrMobi',
            title: '手机号',
            align: 'center',
            width: '200',

        },{
            field: 'usrNm',
            title: '姓名',
            align: 'center',
            width: '200',

        }, {
            field: 'usrMail',
            title: '邮箱',
            align: 'center',
            width: '200',

        }, {
            field: 'deptNm',
            title: '所属部门',
            align: 'center',
            width: '200',
        }, {
            field: 'crtDt',
            title: '创建时间',
            align: 'center',
            formatter: function (value, row, index) {
                return dateFtt("yyyy-MM-dd", new Date(value));
            }


        }, {
            field: 'status',
            title: '状态',
            align: 'center',
            formatter:function (value,row,index) {
                if(value == 1){
                    return "启用";
                }else if(value == 2){
                    return "停用";
                }
            }
        },
            {
                field: 'currentUserAccount',
                title: '创建人',
                width: '100',
                align: 'center',


            }, {
                field: 'operate',
                title: '操作',
                width: '150',
                align: 'center',
                formatter: function (value, row, index) {
                    var a = '<a class="editRow" href="#" data-toggle="modal" data-target="#addModal"    >' +
                        '编辑</a>';
                    a += '<a class="deleteRow" href="#" data-toggle="modal" data-target="#deleteModal" style="margin-left: 5px;margin-right: 5px" >' +
                        '删除</a>';
                    a += '<a class="selectRole" href="#" data-toggle="modal" data-target="#roleModal" >' +
                        '角色</a>';
                    return a;
                },
                events: {
                    'click .editRow': function (e, value, row, index) {
                        debugger
                        $("input[name='userAccount']").val(row.usrAcnt);
                        $("input[name='userMobile']").val(row.usrMobi);
                        $("input[name='userName']").val(row.usrNm);
                        $("input[name='departName']").val(row.deptNm);
                        $("input[name='userEmail']").val(row.usrMail);
                        $("input[name='lgcSn']").val(row.lgcSn);
                        $(":radio[name='status'][value='" + row.status + "']").prop("checked", "checked");
                        $(".modal-title").html("编辑用户");
                        $("#saveButton").hide();
                        $("#editButton").show();

                    },
                    'click .deleteRow': function (e, value, row, index) {
                        $("#deleteInfo").html("你确定要删除用户"+row.usrAcnt+"?");
                        $("input[name='lgcSn']").val(row.lgcSn);
                        $(".modal-title").html("删除用户");
                    },
                    'click .selectRole': function (e, value, row, index) {

                    },

                }
            }],

    });

}

//加载角色选择表的数据
function roledata() {
    $.ajax({
        type: "POST",
        url: "/role/queryRole",
        data: {status: 1},
        dataType: "json",
        success: function (msg) {
            $('#selectRoleable').bootstrapTable('load', msg);
            $(".pull-left.pagination-detail .pagination-info").empty();
            $(".pull-left.pagination-detail .pagination-info").html("共 "+msg.length+" 条记录 ");
            $("#selectRoleable").bootstrapTable('hideLoading');
        },
        error: function () {
            toastr.error("数据加载失败!");
        }
    });
}

//加载数据
function loaddata() {
    $.ajax({
        type: "POST",
        url: "/user/queryAllUser",
        dataType: "json",
        success: function (msg) {
            $('#usertable').bootstrapTable('load', msg);
            $(".pull-left.pagination-detail .pagination-info").empty();
            $(".pull-left.pagination-detail .pagination-info").html("共 "+msg.length+" 条记录 ");
            $("#usertable").bootstrapTable('hideLoading');
        },
        error: function () {
            toastr.error("数据加载失败!");
        }
    });
}

function changeModalStyle() {
    debugger
    $("input[name='userAccount']").val("");
    $('#aaaaa').removeAttr("disabled");
    $("input[name='userMobile']").val("");
    $("input[name='userName']").val("");
    $("input[name='departName']").val("");
    $("input[name='userEmail']").val("");
    $(":radio[name='status'][value='1']").prop("checked", "checked");
    $(".modal-title").html("新增用户");
    $("#saveButton").show();
    $("#editButton").hide();
}



















/*$(function () {
    $('#user_form').validate({

        // 验证规则
        rules:{
            username:{ //form表单中input[name='account']元素的验证规则
                required: true,                  //必须字段，不能为空
                rangelength: [2, 20],
            },
            password:{
                required: true,
                rangelength: [6, 30],
            },



        },

        // 提示消息
        messages:{
            username:{
                required: '账号不能为空',
                rangelength: '用户名必须在{0}-{1}个字之间',
            },
            password:{
                required: '密码不能为空',
                rangelength: '密码名必须在{0}-{1}个位之间',
            },

        },

        // 错误标签元素
        errorElement: 'span',

       /!* // 错误提示位置
        errorPlacement: function (error, element) { // error是错误信息的提示元素，element是当前input域
            debugger
            error.appendTo(element.parent()); //追加提示元素，去掉之前的成功元素
        },*!/


    });



})*/











