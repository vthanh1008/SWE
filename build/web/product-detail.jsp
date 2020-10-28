<%-- 
    Document   : product-detail
    Created on : Oct 13, 2020, 8:52:22 PM
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
    <body style="text-align: center">
        <img src="accsets/image/Product/${product.image}" width="100" height="100"/>
        <h1>${requestScope.product.name}</h1>
        <p>Giá: ${requestScope.product.price}</p>
        <p>Số lượng: ${requestScope.product.quantity}</p>
        <p>Mô tả: ${requestScope.product.description}</p>
        
    </body>
</html>
