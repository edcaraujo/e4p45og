<%-- 
    Document   : redirect
    Created on : 25/09/2020, 21:55:47
    Author     : edcar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% response.sendRedirect("http://www.google.com/"); %>
        <h1>Hello World!</h1>
    </body>
</html>
