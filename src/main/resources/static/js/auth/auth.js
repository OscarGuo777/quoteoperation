

function changeModalStyle() {
    $("input[name='authName']").val("");
    $(":radio[name='status'][value='1']").prop("checked", "checked");
    $(".modal-title").html("新增权限");
    $("#saveButton").show();
    $("#editButton").hide();
}

//新增权限
function addAuth(){
    var authNm = $("input[name='authName']").val();
    var status = $('input[name="status"]:checked').val();
    $.ajax({
        url: "/auth/saveAuth",
        data: {authNm: authNm, status: status},
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

//编辑权限
function editAuth() {
    var authNm = $("input[name='authName']").val();
    var status = $('input[name="status"]:checked').val();
    var lgcSn = $("input[name='lgcSn']").val();
    $.ajax({
        url: "/auth/editAuth",
        data: {authNm: authNm,
            status: status,lgcSn:lgcSn},
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



//删除权限
function deleteAuth() {
    var lgcSn = $("input[name='lgcSn']").val();
    $.ajax({
        url: "/auth/deleteAuth",
        data: {lgcSn: lgcSn},
        type: "post",
        dataType: "text",
        success: function (result) {
            if (JSON.parse(result).state == "true") {
                toastr.success("删除成功!");
            } else {
                toastr.error("删除失败!");
            }
            loaddata();
        }
    })
}




function loadtable() {
    $("#authtable").bootstrapTable({
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
            field: 'authNm',
            title: '权限名称',
            align: 'center',

        },
            {
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
        }, {
            field: 'crtDt',
            title: '创建时间',
            align: 'center',
            formatter: function (value, row, index) {
                return dateFtt("yyyy-MM-dd", new Date(value));
            }


        }, {
            field: 'usrAcnt',
            title: '创建人',
            width: '100',
            align: 'center',


        }, {
            field: 'operate',
            title: '操作',
            width: '150',
            align: 'center',
            formatter: function (value, row, index) {
                var a = '<a class="editRow" href="#" data-toggle="modal" data-target="#addModal" style="margin-right: 5px"   >' +
                    '编辑</a>';
                a += '<a class="deleteRow" href="#" data-toggle="modal" data-target="#myModal" >' +
                    '删除</a>';
                return a;
            },
            events: {
                'click .editRow': function (e, value, row, index) {
                    $("input[name='authName']").val(row.authNm);
                    $("input[name='lgcSn']").val(row.lgcSn);
                    $(":radio[name='status'][value='" + row.status + "']").prop("checked", "checked");
                    $(".modal-title").html("编辑权限");
                    $("#saveButton").hide();
                    $("#editButton").show();

                },
                'click .deleteRow': function (e, value, row, index) {
                    $("#deleteModal").modal("show");
                    $("#deleteInfo").html("你确定要删除权限"+row.authNm+"?");
                    $("input[name='lgcSn']").val(row.lgcSn);
                    $(".modal-title").html("删除权限");
                }
            }
        }],

    });

}

//加载数据
function loaddata() {
    $.ajax({
        type: "POST",
        url: "/auth/queryAuth",
        dataType: "json",
        success: function (msg) {
            $('#authtable').bootstrapTable('load', msg);
            $(".pull-left.pagination-detail .pagination-info").empty();
            $(".pull-left.pagination-detail .pagination-info").html("共 "+msg.length+" 条记录 ");
            $("#authtable").bootstrapTable('hideLoading');
        },
        error: function () {
            toastr.error("数据加载失败!");
        }
    });
}
