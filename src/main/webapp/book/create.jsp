<%--
  Created by IntelliJ IDEA.
  User: kieuanh
  Date: 29/05/2021
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>

    <title>Title</title>
    <head>
        <title>Page Title</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="format-detection" content="telephone=no" />
    </head>

<body>
<H1>Tao moi sach</H1>
<form method="post">
    <input type="text" name="name" placeholder="name">
    <input type="text" name="author" placeholder="author">
    <input type="text" name="description" placeholder="description">

    <select name="categories" id="categories">
        <c:forEach items="${categories}" var="c">
            <option value="${c.id}">${c.name}</option>
        </c:forEach>
    </select>
    <input value="tao moi" type="submit">
</form>
</body>
</html>
