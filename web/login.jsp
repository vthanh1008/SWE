<%-- 
    Document   : login
    Created on : Oct 20, 2020, 8:08:49 PM
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
        <div style="text-align: center">
            
            
            <form action="login" method="post" style="width: 300px; padding: 40px; position: absolute; top: 50%; left: 50%; transform: translate(-50%,-50%); text-align: center;">
                <h1>Login</h1>
                <p style="color: red">${message != null ? message : ""}</p>
                <table>
                    <tr>
                        <td>Account: </td>
                        <td><input type="text" name="account" style="background: none;display: block; margin: 20px auto; text-align: center; border: 2px solid #3498db; padding: 14px 10px; width: 200px; outline: none; color: black; border-radius: 24px; transition: 0.25s;"></td>
                    </tr>
                    <tr>
                        <td>Password: </td>
                        <td><input type="password" name="password" style="background: none;display: block; margin: 20px auto; text-align: center; border: 2px solid #3498db; padding: 14px 10px; width: 200px; outline: none; color: black; border-radius: 24px; transition: 0.25s;"></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <button type="submit" style="background: none; display: block; margin: 20px auto; text-align: center; border: 2px solid #2ecc71; padding: 14px 40px; outline: none; color: black; border-radius: 24px; transition: 0.25s; cursor: pointer;">LOGIN</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
