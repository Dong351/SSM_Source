<%--
  Created by IntelliJ IDEA.
  User: Dong
  Date: 2019/11/4
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<html>
<head>
    <title>findAll</title>
</head>
<body>
<%--<h3>所有账户</h3>--%>
<c:forEach items="${accounts}" var="accout">
    ${accout.name}
    <br>
</c:forEach>
</body>
</html>
