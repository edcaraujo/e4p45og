<%-- 
    Document   : index
    Created on : 25/09/2020, 21:30:01
    Author     : edcar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web Exemplo #1</title>
    </head>
    
    <%
        Date date = new Date();
    %>
    
    <body>
        <h1>Hello World!</h1>
        <p>Hoje é: <%= date %></p>
    </body>
</html>
