<%--
  Created by IntelliJ IDEA.
  User: Lemon Jenkins
  Date: 05.10.2016
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>LemonJenkins</title>
  </head>
  <body>
  <p> ${message} </p>
  <form method="post" action="/Login" >
  <input type="text" name="name">
    <input type="submit" name="sub" value="НАЖМИ">
    </form>
  </body>
</html>
