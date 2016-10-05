<%--
  Created by IntelliJ IDEA.
  User: Lemon Jenkins
  Date: 05.10.2016
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Super Calculator</title>
</head>
<body>
<form method="post" action="/Calc" >
    <input type="text" name="num1">
    <input type="text" name="znak">
    <input type="text" name="num2">
    <input type="submit" name="anser" value="Ответ">
</form>
<p>${message}</p>
<%--<span> ${message}</span>--%>
<%--<span>${message1}</span>--%>
<%--<span>${message2}</span>--%>
<%--<span>=</span>--%>
<%--<span>${message3} </span>--%>
</body>
</html>
