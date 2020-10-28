<%-- 
    Document   : insert
    Created on : Oct 13, 2020, 8:00:32 PM
    Author     : A410R
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="InsertProduct" method="POST">
        <table>
                <tr>
                    <td>ID: </td>
                    <td><input type="number" name="id"></td>
                </tr>
                <tr>
                    <td>BrandID: </td>
                    <td><input type="number" name="brandId"></td>
                </tr>
                    <td>SizeID: </td>
                    <td><input type="number" name="sizeId"></td>
                <tr>
                    <td>StatusID: </td>
                    <td><input type="number" name="statusId"></td>
                </tr>
                <tr>
                    <td>Name: </td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>Image: </td>
                    <td><input type="text" name="image"></td>
                </tr>
                <tr>
                    <td>Price: </td>
                    <td><input type="number" name="price"></td>
                </tr>
                <tr>
                    <td>Quantity: </td>
                    <td><input type="number" name="quantity"></td>
                </tr>
                <tr>
                    <td>Description: </td>
                    <td><input type="text" name="description"></td>
                </tr>
                <tr>
                    <td>
                        <button type="submit" name="update">Update</button>
                    </td>
                </tr>
        </form>
        
        
    </body>
</html>
