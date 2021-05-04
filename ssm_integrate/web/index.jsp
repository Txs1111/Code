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
    function a() {
        $.post({
            url: "${pageContext.request.contextPath}/login",
            data: {"username": $("#username").val()},
            success: function (data) {
                console.log(data);
                $("#userInfo").html(data);
            }
        })

    }
</script>
<body>
<div>
    <div>
        <%--失去焦点he点击时执行a函数--%>
        <form action="" method="post">
            <div>账号：<input type="text" id="username" onblur="a()" onclick="a()"><span id="userInfo"></span></div>
            <div>密码：<input type="password" id="pwd"><span id="pwdInfo"></span></div>
            <div><input type="submit" id="submit" value="登录"></div>
        </form>
    </div>
</div>
</body>
</html>
