<%--
  Created by IntelliJ IDEA.
  User: 65648
  Date: 2023/3/7
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>注册</h2>
<form action="${pageContext.request.contextPath}/registerUser" method="post">
  <label>
    用户名:
    <input type="text" name="username"/>
  </label>
  <label>
    密码:
    <input type="text" name="password"/>
  </label>
  <input type="submit" value="注册">
</form>
</body>
</html>
