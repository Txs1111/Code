<%--
  Created by IntelliJ IDEA.
  User: Lyon
  Date: 2021-4-30
  Time: 下午 02:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>T_Lyon的学习登录页面</title>
</head>
<script src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.js"></script>
<script>
    function u() {
        // 动态验证账号
        $.post({
            url: "${pageContext.request.contextPath}/verify",
            data: {"username": $("#username").val(), "pwd": $("#pwd").val()},
            success: function (data) {
                if (data == "ok" || data == "true") {
                    $("#userInfo").css("color", "green");
                    $("#userInfo").html("√");
                } else {
                    $("#userInfo").css("color", "red");
                    $("#userInfo").html("账号错误");
                }
            }
        })
    }

    function p() {
        // 动态验证密码
        $.post({
            url: "${pageContext.request.contextPath}/verify",
            data: {"username": $("#username").val(), "pwd": $("#pwd").val()},
            success: function (data) {
                if (data == "true") {
                    $("#pwdInfo").css("color", "green");
                    $("#pwdInfo").html("√");
                } else {
                    $("#pwdInfo").css("color", "red");
                    $("#pwdInfo").html("密码错误");
                }
            }
        })
    }

</script>
<body>
<div>
    <div>
        <%--失去焦点he点击时执行函数--%>
        <form action="${pageContext.request.contextPath}/login" method="get">
            <div>
                账号：<input type="text" id="username" name="username" onblur="u()" required>
                <span id="userInfo"></span>
            </div>
            <div>
                密码：<input type="password" id="pwd" name="pwd" onblur="p()" required>
                <span id="pwdInfo"></span>
            </div>
            <div>
                <input type="submit" id="submit" value="登录">
            </div>
        </form>
    </div>

    <div>
        <div><a href="${pageContext.request.contextPath}/WEB-INF/jsp/register.jsp">注册</a></div>
    </div>
</div>
</body>
</html>
