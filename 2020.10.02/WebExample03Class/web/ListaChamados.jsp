<%-- 
    Document   : ListaChamados
    Created on : 02/10/2020, 21:47:59
    Author     : edcar
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="db.DBChamado" %>
<%@page import="core.Chamado" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chamados abertos</title>
    </head>
    <body>
        <h1>Chamados abertos</h1>
        <%
            List<Chamado> list = DBChamado.getInstance().getChamados(); 
        %>
        
        <ul>
        
        <%
        for (Chamado c : list) {
        %>           
        
        <li><%= c.getDescricao() %></li>
        
        <%
        }
        %>
        </ul>
    </body>
</html>
