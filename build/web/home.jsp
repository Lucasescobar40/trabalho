<%-- 
    Document   : home
    Created on : 27 de abr. de 2023, 09:43:38
    Author     : QI
--%>

<%@include file="session/verify.jsp" %>

<%@page import="model.User" %>
<%
    User u = (User)session.getAttribute("userSession");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Game</title>
        <style>
            html{
                text-align: center;
                background-image: url(https://blog.unipar.br/wp-content/uploads/2019/09/original-78b22fe9e8b592905ab601121d1e350c-1110x508.png);
                background-repeat: no-repeat;
                color: white;
                background-size: 1440px;
            }
            button{
                border-radius: 20px;
                background-color: white;              
            }
            p{
                font-weight: 700;
                font-size:  larger;
                font-family: cursive;
            }
        </style>
    </head>
    <body>
        <p>
            <button type="button" onclick=window.location.href="session/logout.jsp">Logout</button>
            Bem vindo <%= u.getUserName() %>!
        </p>
        <main>
            <button onclick="window.location.href='cadastro.jsp'">Cadastrar</button>
            <button onclick="window.location.href='lista.jsp'">Listar</button>
        </main>
    </body>    
</html>
