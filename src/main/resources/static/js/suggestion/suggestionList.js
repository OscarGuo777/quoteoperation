//时间控件
function Datetime() {
    $('#suggestionquery1').datetimepicker({
        language: 'zh-CN',//显示中文
        format: 'yyyy-mm-dd',//显示格式
        minView: "month",//设置只显示到月份
        initialDate: new Date(),
        autoclose: true,//选中自动关闭
        todayBtn: true,//显示今日按钮
        locale: moment.locale('zh-cn')
    });
    $('#suggestionquery2').datetimepicker({
        language: 'zh-CN',//显示中文
        format: 'yyyy-mm-dd',//显示格式
        minView: "month",//设置只显示到月份
        initialDate: new Date(),
        autoclose: true,//选中自动关闭
        todayBtn: true,//显示今日按钮
        locale: moment.locale('zh-cn')
    });
    //默认获取当前日期
    var today = new Date();
    var nowdate = (today.getFullYear()) + "-" + (today.getMonth() + 1) + "-" + today.getDate();
    //对日期格式进行处理
    var date = new Date(nowdate);
    var mon = date.getMonth() + 1;
    var day = date.getDate();
    var mydate = date.getFullYear() + "-" + (mon < 10 ? "0" + mon : mon) + "-01";
    var mydate1 = date.getFullYear() + "-" + (mon < 10 ? "0" + mon : mon) + "-" + (day < 10 ? "0" + day : day);
    $("#suggestionquery1").val(mydate);
    $("#suggestionquery2").val(mydate1);
}

//创建表格
function loadtable() {
    $("#suggestiontable").bootstrapTable({
        classes: 'table table-hover mb-0',
        // striped: true,
        pagination: true,
        pageNumber: 1,
        pageSize: 5,
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
            field: 'sgtnTpcd',
            title: '类型',
            align: 'center',
            width: '100',
            // switchable: true
        }, {
            field: 'crtDt',
            title: '反馈日期',
            align: 'center',
            width: '200',
            formatter: function (value, row, index) {
                var time = row.crtDt;
                var unixTimestamp = new Date(time);
                commonTime = unixTimestamp.toLocaleString();
                return commonTime;
            }
        }, {
            field: 'sgtnCntnt',
            title: '内容概述',
            align: 'center',
        }, {
            field: 'rplyCntnt',
            title: '回复概述',
            align: 'center',
            formatter: function (value, row, index) {
                if (row.rplyCntnt == null) {
                    return "";
                } else  {
                    return row.rplyCntnt;
                }

            }
        }, {
            field: 'hfstate',
            title: '回复状态',
            width: '100',
            align: 'center',
            formatter: function (value, row, index) {
                var rplyCntnt = row.rplyCntnt;
                if (rplyCntnt == null || "" == rplyCntnt) {
                    return "否";
                } else if (rplyCntnt.length > 0) {
                    return "是";
                }
            }
        }, {
            field: 'operate',
            title: '操作',
            width: '150',
            align: 'center',
            formatter: function (value, row, index) {
                var a = '<a class="Information" href="#" data-toggle="modal" data-target="#myModal" >' +
                    '<i class="fa fa-search"></i>查看详细</a>';
                return a;
            },
            events: {
                'click .Information': function (e, value, row, index) {
                    $.ajax({
                        url: "/suggestion/toInformationlist?lgcSn=" + row.lgcSn + "&suggestiontype=" + row.sgtnTpcd,
                        dataType: "json",
                        contentType: "application/json;charset=utf-8",
                        success: function (data) {
                            $("#fileup").hide();
                            $("#fileshow").show();
                            $("#addbutton").hide();

                            $("#sgtnCntnt").html(data[0][0]["sgtnCntnt"])
                            $("#rplyCntnt").val(data[0][0]["rplyCntnt"])
                            $("#lgcSn").val(row.lgcSn)

                            //没有回复内容不显示回复
                            if(data[0][0]["rplyCntnt"]!=null||data[0][0]["rplyCntnt"]!=""){
                                // $("#glyff").css("display","none");
                                $("#glyff").css("display","block");
                                $("#glyff").css("readonly","readonly");
                            }

                            //加载图片和名称
                            if (data[1].length > 0) {
                                $("#suggestionatchInfos").empty();
                                for (var i = 0; i < data[1].length; i++) {
                                    var atchPath = data[1][i]["atchPath"]
                                    var atchNm = data[1][i]["atchNm"]
                                    $("#suggestionatchInfos").append("<img src='" + atchPath + "' style='width: 90%;margin-left: 5%;'>" +
                                        " <p><a href='/file/down?name=" + atchNm + "&pathUrl=" + encodeURI(atchPath) + "' target='_blank'>" + atchNm + "</a></p>");
                                }
                            }
                        }
                    });
                }
            }
        }],

    });
    // 隐藏行
    $("#suggestiontable").bootstrapTable('hideColumn', 'rplyCntnt');
    $("#suggestiontable").bootstrapTable('hideColumn', 'sgtnTpcd');
    //隐藏加载提醒
    $("#suggestiontable").bootstrapTable('hideLoading');
}

//加载数据
function loaddata() {
    var suggestionquery1 = $("#suggestionquery1").val();
    var suggestionquery2 = $("#suggestionquery2").val();
    var suggestiontype = $("#suggestiontype").val();

    $.ajax({
        type: "POST",
        url: "/suggestion/query",
        data: {suggestionquery1: suggestionquery1, suggestionquery2: suggestionquery2, suggestiontype: suggestiontype},
        // contentType: "application/json;charset=utf-8",
        dataType: "json",
        success: function (msg) {
            $('#suggestiontable').bootstrapTable('load', msg);
            $(".pull-left.pagination-detail .pagination-info").empty();
            $(".pull-left.pagination-detail .pagination-info").html("共 "+msg.length+" 条记录 ");
        },
        error: function () {
            toastr.error("数据加载失败!");
        }
    });
}

//时间对象转换成字符串
Date.prototype.toLocaleString = function () {
    return this.getFullYear() + "/" + (this.getMonth() + 1) + "/" + this.getDate();
};

//点击查看表单概况信息
function xingxi() {
    $('#suggestiontable').on('click-row.bs.table', function (e, row, element) {
        $("#suggestiontext").html("反馈内容：\r" + row.sgtnCntnt  +
            (row.rplyCntnt==undefined||row.rplyCntnt==""?"": "\r\r" + "管理员回复:\r" +row.rplyCntnt));

    });
}

//新增
function adddata() {
    var atchInfos = $("#atchInfos").val();
    var sginCntnt = $("#sginCntnt").val();
    var suggestiontype = $("#suggestiontype").val();
    var username = $("#username").html();
    var authorities = $("#authorities").html();

    $.ajax({
        url: "/suggestion/addData",
        data: {sginCntnt: sginCntnt, atchInfos: atchInfos,
            suggestiontype: suggestiontype,
            username: username, authorities: authorities},
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

function addhfdata() {
    var username=$("#username").html();
    var rplyCntnt=$("#rplyCntnt").val();
    var lgcSn=$("#lgcSn").val();

    $.ajax({
        url: "/suggestion/addhfdata",
        data: {lgcSn: lgcSn, username: username,rplyCntnt:rplyCntnt},
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

// 上传图片
function upfile() {
    var formData = new FormData($("#uploadForm")[0]);
    var username = $("#username").html();
    $.ajax({
        url: "/file/upload?username="+username,
        data: formData,
        type: "Post",
        dataType: "json",
        cache: false,//上传文件无需缓存
        processData: false,//用于对data参数进行序列化处理 这里必须false
        contentType: false, //必须
        success: function (result) {
            $("#atchInfos").val(JSON.stringify(result));
            toastr.success("上传成功!");
        },
        error: function () {
            toastr.error("上传失败!");
        }
    })
}

// 判断图片格式
function uploadImg() {
    var _name, _fileName, personsFile;
    personsFile = document.getElementById("personsFile");
    _name = personsFile.value;
    _fileName = _name.substring(_name.lastIndexOf(".") + 1).toLowerCase();
    if (_fileName !== "png" && _fileName !== "jpg") {
        alert("上传图片格式不正确，请重新上传");
    }
}

//新增按钮显示控制
function changestyle() {
    $("#fileup").show();
    $("#sginCntnt").val("");
    $("#files").val("");
    $("#fileshow").hide();
    $("#addbutton").show();
    $("#hfbutton").hide();
}

