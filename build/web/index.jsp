<%-- 
    Document   : index
    Created on : Oct 7, 2020, 9:04:49 PM
    Author     : A410R
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="index1CSS.css">
    </head>
    <body>
        <div id="top">
            <div id="logo"><a href="index.jsp">SHOPGiayAuth</div>
            <form action="SearchServlet" method="POST" style=" display: inline-block;">
                <div style=" height: 50px; width: 500px; display: inline-block;">
                    <input id="inputSearch" type="text" placeholder="Search.." name="search" >
                    <button type="submit" name="search" style="float: right; padding: 6px; border: none; margin-top: 8px; margin-right: 16px; font-size: 17px;">Search</button>
                </div>    
            </form>
        </div>
        <div id="bot">
            <div id="menu">
                <c:forEach items="${requestScope.listBrand}" var="brand">
                    <div id="brand"> <a href="filter-brand?id=${brand.id}" style="margin: 0 20px;">${brand.brand}</a></div>
                    </c:forEach>

            </div>
            <div id="displayItem">
                <table border="2">
                    <tr>
                        <th>ID</th>
                        <th>Brand</th>
                        <th>Size</th>
                        <th>Status</th>
                        <th>Name</th>
                        <th>Image</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>Description</th>
                    </tr>
                    <c:forEach items="${requestScope.listProduct}" var="product">
                        <tr>
                            <td>${product.id}</td>
                            <td>${product.brandID}</td>
                            <td>${product.sizeID}</td>
                            <td>${product.statusID}</td>
                            <td>
                                <a href="product-detail?id=${product.id}">${product.name}</a>
                            </td>
                            <td>
                                <img src="accsets/image/Product/${product.image}" width="100" height="100"/>
                            </td>
                            <td>${product.price}</td>
                            <td>${product.quantity}</td>
                            <td>${product.description}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>





        </div>




    </body>
</html>
