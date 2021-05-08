<%--
  Created by IntelliJ IDEA.
  User: Lyon
  Date: 1521-5-5
  Time: 下午 07:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<script>
    var type = {"u": "no", "p": "no", "p2": "no"};

    function u() {
        $.post({
            url: "${pageContext.request.contextPath}/verifyUsername",
            data: {"username": $("#username").val()},
            success: function (data) {
                $("#usernameInfo").css("color", "red");
                type.u = "no";
                if (data === "litter3") {
                    $("#usernameInfo").html("字数不得小于3位");
                } else if (data === "big15") {
                    $("#usernameInfo").html("字数不得超过15位");
                } else if (data === "blank") {
                    $("#usernameInfo").html("账号不能为出现空格");
                } else if (data === "exist") {
                    $("#usernameInfo").html("账号已经存在");
                } else if (data === "yes") {
                    $("#usernameInfo").css("color", "green");
                    $("#usernameInfo").html("√");
                    type.u = "yes";
                }
            }
        })
    }

    function p() {
        $.post({
            url: "",
            success: function () {
                $("#passwordInfo").css("color", "red");
                type.p = "no";
                // 判断长度
                if ($("#pwd").val().length < 6) {
                    $("#passwordInfo").html("字数不得小于6位");
                } else {
                    // 判断空格
                    if ($("#pwd").val().indexOf(" ") != -1) {
                        $("#passwordInfo").html("密码中不能有空格");
                    } else {
                        $("#passwordInfo").css("color", "green");
                        $("#passwordInfo").html("√");
                        type.p = "yes";
                    }
                }
                if ($("#pwd2").val().length > 0)
                    p2();
            }
        })
    }

    function p2() {
        $.post({
            url: "",
            success: function () {
                $("#password2Info").css("color", "red");
                type.p2 = "no";
                // 判断长度
                if ($("#pwd2").val().length < 6) {
                    $("#password2Info").html("字数不得小于6位");
                } else {
                    // 判断空格
                    if ($("#pwd2").val().indexOf(" ") != -1) {
                        $("#password2Info").html("密码中不能有空格");
                    } else {
                        // 判断重复
                        if ($("#pwd").val() != $("#pwd2").val()) {
                            $("#password2Info").html("两次密码不同");
                        } else {
                            $("#password2Info").css("color", "green");
                            $("#password2Info").html("√");
                            type.p2 = "yes";
                        }
                    }
                }
            }
        })
    }

    function a() {
        if (type.u == "yes" && type.p == "yes" && type.p2 == "yes") {
            $("#result").val("yes");
        } else $("#result").val("no");
    }

    function f() {
        $.post({
                url: "${pageContext.request.contextPath}/register",
                data: {
                    "username": $("#username").val(),
                    "pwd": $("#pwd").val(),
                    "pwd2": $("#pwd2").val(),
                    "result": $("#result").val()
                }, success: function (data) {
                    s();
                }
            }
        )
    }

    function s() {
        $.post({
            url: "${pageContext.request.contextPath}/registerSub",
            data: {"username": $("#username").val(), "result": $("#result").val()},
            success: function (data) {
                if ($("#result").val() == "yes") {
                    alert("注册成功" + "\n" + "您的账号为：" + data);
                    $(location).attr('href', 'http://localhost:8080');
                } else {
                    alert("信息错误！");
                }
            }
        })
    }


</script>
<script src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.js"></script>
<div>
    <div>
        用户名：<input type="text" name="username" id="username" onblur="u()" required>
        <input type="text" name="result" id="result" style="display: none">
        <span id="usernameInfo"></span>
    </div>
    <div>
        密码：<input type="password" name="pwd" id="pwd" onblur="p()" required>
        <span id="passwordInfo"></span>
    </div>
    <div>
        确认密码：<input type="password" name="pwd2" id="pwd2" onblur="p2()" required>
        <span id="password2Info"></span>
    </div>
    <div>
        验证码
    </div>
    <div>
        <input type="submit" id="submit" onclick="a(),f()">
    </div>
</div>
</body>
</html>
