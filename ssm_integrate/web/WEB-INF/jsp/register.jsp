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
<script src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.js"></script>
<script>
    function u() {
        $.post({
            url: "",
            data: {"username": $("#username").val(), "pwd": $("#pwd").val(), "pwd2": $("#pwd2").val()},
            success: function (data) {
                $("#usernameInfo").css("color", "red");
                if ($("#username").val().length > 15) {
                    $("#usernameInfo").html("字节数不得超过15");
                } else if ($("#username").val().length < 3) {
                    $("#usernameInfo").html("字节数不得小于3");
                } else if ($("#username").val().indexOf(" ") != -1) {
                    $("#usernameInfo").html("密码中不能有空格");
                } else {
                    $("#usernameInfo").css("color", "green");
                    $("#usernameInfo").html("√");
                }
            }
        })
    }

    function p() {
        $.post({
            url: "",
            data: {"username": $("#username").val(), "pwd": $("#pwd").val(), "pwd2": $("#pwd2").val()},
            success: function () {
                $("#passwordInfo").css("color", "red");
                if ($("#pwd").val().length > 15) {
                    $("#passwordInfo").html("字节数不得超过15");
                } else if ($("#pwd").val().length < 3) {
                    $("#passwordInfo").html("字节数不得小于3");
                } else if ($("#pwd").val().indexOf(" ") != -1) {
                    $("#passwordInfo").html("密码中不能有空格");
                } else {
                    $("#passwordInfo").css("color", "green");
                    $("#passwordInfo").html("√");
                }
            }
        })
    }

    function p2() {
        $.post({
            url: "",
            data: {"username": $("#username").val(), "pwd": $("#pwd").val(), "pwd2": $("#pwd2").val()},
            success: function () {
                $("#password2Info").css("color", "red");
                if ($("#pwd2").val().length > 15) {
                    $("#password2Info").html("字节数不得超过15");
                } else if ($("#pwd2").val().length < 3) {
                    $("#password2Info").html("字节数不得小于3");
                } else if ($("#pwd2").val().indexOf(" ") != -1) {
                    $("#password2Info").html("密码中不能有空格");
                } else if ($("#pwd").val() != $("#pwd2").val()) {
                    $("#password2Info").html("两次密码不同");
                } else {
                    $("#password2Info").css("color", "green");
                    $("#password2Info").html("√");
                }
            }
        })
    }


</script>
<div>
    <form action="${pageContext.request.contextPath}/register" method="get">
        <div>
            用户名：<input type="text" name="username" id="username" onblur="u()" required>
            <span id="usernameInfo"></span>
        </div>
        <div>
            密码：<input type="password" name="" id="pwd" onblur="p()" required>
            <span id="passwordInfo"></span>
        </div>
        <div>
            确认密码：<input type="password" name="" id="pwd2" onblur="p2()" required>
            <span id="password2Info"></span>
        </div>
        <div>
            验证码
        </div>
        <div>
            <input type="submit" id="submit">
        </div>
    </form>
</div>
</body>
</html>
