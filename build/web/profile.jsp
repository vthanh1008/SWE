<%-- 
    Document   : profile
    Created on : Oct 20, 2020, 8:21:16 PM
    Author     : A410R
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${sessionScope.account}</h1>
        <a href="Logout">logout</a>
    </body>
</html>
