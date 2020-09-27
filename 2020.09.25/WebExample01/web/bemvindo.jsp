<%-- 
    Document   : bemvindo
    Created on : 25/09/2020, 22:00:35
    Author     : edcar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bem-vindo!</title>
    </head>
    <body>
        <h1><%= session.getAttribute("nome_usuario") %> </h1>
    </body>
</html>
