
function changeModalStyle() {
    $("input[name='dictCd']").val("");
    $("input[name='dictName']").val("");
    $(":radio[name='status'][value='1']").prop("checked", "checked");
    $(".modal-title").html("新增字典");
    $("#saveButton").show();
    $("#editButton").hide();
}

//新增字典
function addDict(){
    var dictCd = $("input[name='dictCd']").val();
    var dictName = $("input[name='dictName']").val();
    var status = $('input[name="status"]:checked').val();
    $.ajax({
        url: "/dict/saveDict",
        data: {dictCd: dictCd,dictName:dictName,status: status},
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

//编辑字典
function editDict() {
    debugger
    var dictCd = $("input[name='dictCd']").val();
    var dictName = $("input[name='dictName']").val();
    var status = $('input[name="status"]:checked').val();
    var lgcSn = $("input[name='dictLgcSn']").val();
    $.ajax({
        url: "/dict/editDict",
        data: {dictCd: dictCd,dictName:dictName,
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



//删除字典
function deleteDict() {
    var lgcSn = $("input[name='dictSn']").val();
    $.ajax({
        url: "/dict/deleteDict",
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



//加载表格
function loadtable() {
    $("#dicttable").bootstrapTable({
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
            field: 'dictCd',
            title: '字典编码',
            align: 'center',

        },
            {
                field: 'dictNm',
                title: '字典名称',
                align: 'center',

            },


            {
                field: 'status',
                title: '状态',
                align: 'center',
                formatter: function (value, row, index) {
                    if (value == 1) {
                        return "启用";
                    } else if (value == 2) {
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
                width: '200',
                align: 'center',
                formatter: function (value, row, index) {
                    var a = '<a class="editRow" href="#" data-toggle="modal" data-target="#addModal" style="margin-right: 5px"   >' +
                        '编辑</a>';
                    a += '<a class="deleteRow" href="#" data-toggle="modal" data-target="#deleteModal" style="margin-right: 5px">' +
                        '删除</a>';
                    a += '<a class="editDetailRow" href="#" data-toggle="modal" data-target="#editDetailModal"  style="margin-right: 5px">' +
                        '明细编辑</a>';

                    return a;
                },
                events: {
                    'click .editRow': function (e, value, row, index) {
                        $("input[name='dictCd']").val(row.dictCd);
                        $("input[name='dictName']").val(row.dictNm);
                        $("input[name='dictLgcSn']").val(row.lgcSn);
                        $(":radio[name='status'][value='" + row.status + "']").prop("checked", "checked");
                        $(".modal-title").html("编辑字典");
                        $("#saveButton").hide();
                        $("#editButton").show();

                    },
                    'click .deleteRow': function (e, value, row, index) {
                        $("#deleteDictButton").show();
                        $("#deleteDictDetailButton").hide();
                        $("#deleteInfo").html("你确定要删除字典" + row.dictNm + "?");
                        $("input[name='dictSn']").val(row.lgcSn);
                        $(".modal-title").html("删除字典");
                    },
                    'click .editDetailRow': function (e, value, row, index) {
                        debugger
                        $("input[name='dictSn']").val(row.lgcSn);
                        $("#dictInfo").html("明细编辑");
                        var detailList = row.dictDetailList;
                        $("#detailBody").empty();
                        for (var i = 0; i < detailList.length; i++) {
                            var tr = $("<tr></tr>");
                            var td1 = $("<td></td>");
                            td1.html(detailList[i].dtlCd);
                            var td2 = $("<td></td>");
                            td2.html(detailList[i].dtlNm);
                           /* var td3 = $("<td>\n" +
                                "            <a  href=\"javascript:void(0);\" onclick=\"'javascript:editDictDetail(\\''+detailList[i].dtlCd+'\\',\\''+detailList[i].dtlNm+'\\',\\''+detailList[i].lgcSn+'\\');'\" >编辑</a>\n" +
                                "            <a  href=\"javascript:void(0);\" onclick=\"'javascript:deleteDictDetail(\\''+detailList[i].lgcSn+'\\',\\''+detailList[i].dtlNm+'\\');'\" >删除</a>\n" +
                                "        </td>");*/
                            var td3 = $("<td><a href='#' data-toggle='modal' data-target='#editDetail' onclick='editDictDetail(\" "+detailList[i].dtlCd + "\",\" "+detailList[i].dtlNm + "\",\" "+detailList[i].lgcSn +"\",\" "+row.lgcSn +"\")'>编辑</a>" +
                                "<a href='#' style='margin-left: 10px' data-toggle='modal' data-target='#deleteModal' onclick='deleteDictDetail(\" "+detailList[i].dtlNm + "\",\" "+detailList[i].lgcSn +"\",\" "+row.lgcSn +"\")'>删除</a>" +
                                "</td>")
                            tr.append(td1);
                            tr.append(td2);
                            tr.append(td3);
                            $("#detailBody").append(tr);
                        }


                    }
                }
            }],

    });

}

//删除字典明细
function deleteDictDetail(dtlNm,lgcSn,dictSn) {
    $("#deleteInfo").html("你确定要删除字典明细" + dtlNm + "?");
    $("input[name='lgcSn']").val(lgcSn);
    $("input[name='dictSn']").val(dictSn);
    $("#dict_detail_delete").html("删除字典明细");
    $("#deleteDictButton").hide();
    $("#deleteDictDetailButton").show();
}


//编辑字典明细
function editDictDetail(dtlCd,dtlNm,lgcSn,dictSn) {
    $("input[name='dtlCd']").val(dtlCd);
    $("input[name='dtlNm']").val(dtlNm);
    $("input[name='lgcSn']").val(lgcSn);
    $("input[name='dictSn']").val(dictSn);

    $("#detailEditButton").show();
    $("#detailAddButton").hide();
    $("#editDetailInfo").html("明细编辑");
}
//删除字典明细
function deleteDetail() {

    var lgcSn = $("input[name='lgcSn']").val();
    var dictSn = $("input[name='dictSn']").val();
    $.ajax({
        url: "/dictDetail/deleteDictDetail",
        data: {lgcSn: lgcSn},
        type: "post",
        dataType: "text",
        success: function (result) {
            if (JSON.parse(result).state == "true") {
                toastr.success("保存成功!");
            } else {
                toastr.error("保存失败!");
            }
            reloadDictDetail(dictSn);
            loaddata();
        },
    })
}

//编辑字典明细
function editDetail() {
    var dtlCd = $("input[name='dtlCd']").val();
    var dtlNm = $("input[name='dtlNm']").val();
    var lgcSn = $("input[name='lgcSn']").val();
    var dictSn = $("input[name='dictSn']").val();
    $.ajax({
        url: "/dictDetail/editDictDetail",
        data: {dtlCd: dtlCd,dtlNm:dtlNm,lgcSn: lgcSn,dictSn:dictSn},
        type: "post",
        dataType: "text",
        success: function (result) {
            if (JSON.parse(result).state == "true") {
                toastr.success("保存成功!");
            } else {
                toastr.error("保存失败!");
            }
            reloadDictDetail(dictSn);
            loaddata();
        },
    })
}

//新增字典明细
function AddDetail() {
    $("#editDetail").modal("show");
    var dtlCd = $("input[name='dtlCd']").val("");
    var dtlNm = $("input[name='dtlNm']").val("");
    $("#detailEditButton").hide();
    $("#detailAddButton").show();
    $("#editDetailInfo").html("增加明细");

}
//新增字典明细
function AddDictDetail() {
    var dtlCd = $("input[name='dtlCd']").val();
    var dtlNm = $("input[name='dtlNm']").val();
    //此lgcSn为字典序号，非字典明细序号
    var dictSn = $("input[name='dictSn']").val();
    $.ajax({
        url: "/dictDetail/saveDictDetail",
        data: {dtlCd: dtlCd,dtlNm:dtlNm,dictSn:dictSn},
        type: "post",
        dataType: "text",
        success: function (result) {
            if (JSON.parse(result).state == "true") {
                toastr.success("保存成功!");
            } else {
                toastr.error("保存失败!");
            }
            reloadDictDetail(dictSn);
            loaddata();
        },
    })
}



/*function AddDetail() {
    var tr = $("<tr></tr>");
    var td1 = $("<td></td>");
    var td2 = $("<td></td>");
    var td3 = $("<td>\n" +
        "            <a  href=\"javascript:void(0);\" th:onclick=\"'javascript:editAuth(\\''+${auth.authNm}+'\\',\\''+${auth.status}+'\\',\\''+${auth.lgcSn}+'\\');'\" >编辑</a>\n" +
        "            <a  href=\"javascript:void(0);\" th:onclick=\"'javascript:deleteAuth(\\''+${auth.lgcSn}+'\\',\\''+${auth.authNm}+'\\');'\" >删除</a>\n" +
        "        </td>");

    tr.append(td1);
    tr.append(td2);
    tr.append(td3);
    $("#detailBody").append(tr);
}*/

function reloadDictDetail(lgcSn) {
    $.ajax({
        type: "POST",
        url: "/dict/queryDict",
        dataType: "json",
        success: function (msg) {
            $("#detailBody").empty();
            var detailList ;
            for(var i = 0;i<msg.length;i++){
                if(msg[i].lgcSn == lgcSn){
                    detailList = msg[i].dictDetailList;
                    break;
                }
            }
            for (var i = 0; i < detailList.length; i++) {
                var tr = $("<tr></tr>");
                var td1 = $("<td></td>");
                td1.html(detailList[i].dtlCd);
                var td2 = $("<td></td>");
                td2.html(detailList[i].dtlNm);
                var td3 = $("<td><a href='#' data-toggle='modal' data-target='#editDetail' onclick='editDictDetail(\" "+detailList[i].dtlCd + "\",\" "+detailList[i].dtlNm + "\",\" "+detailList[i].lgcSn +"\",\" "+lgcSn +"\")'>编辑</a>" +
                    "<a href='#' style='margin-left: 10px' data-toggle='modal' data-target='#deleteModal' onclick='deleteDictDetail(\" "+detailList[i].dtlNm + "\",\" "+detailList[i].lgcSn +"\",\" "+lgcSn +"\")'>删除</a>" +
                    "</td>")
               tr.append(td1);
                tr.append(td2);
                tr.append(td3);
                $("#detailBody").append(tr);
            }
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
        url: "/dict/queryDict",
        dataType: "json",
        success: function (msg) {
            $('#dicttable').bootstrapTable('load', msg);
            $(".pull-left.pagination-detail .pagination-info").empty();
            $(".pull-left.pagination-detail .pagination-info").html("共 "+msg.length+" 条记录 ");
            $("#dicttable").bootstrapTable('hideLoading');
        },
        error: function () {
            toastr.error("数据加载失败!");
        }
    });
}

