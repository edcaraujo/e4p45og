<%-- 
    Document   : actionform
    Created on : 25/09/2020, 21:45:59
    Author     : edcar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Action form</title>
    </head>
    <body>
        <% 
            session.setAttribute("nome_usuario", request.getParameter("nome"));
        %>
        
        <h1>Olá, parece que deu tudo certo!</h1>
        <p><a href="bemvindo.jsp">Clique aqui</a> para continuar</p>
    </body>
</html>
