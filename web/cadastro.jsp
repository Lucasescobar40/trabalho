<%-- 
    Document   : cadastro
    Created on : 4 de mai. de 2023, 10:26:21
    Author     : QI
--%>

<%@include file="session/verify.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ESCOBAR GAMES</title>
        <style>
            html{
                background-color:black;
                color: white;
                
            }
            a{
                color: white;
            }
            input{
                border-style: groove;
                border-color: red;
                border-radius: 15px;
            }
            select{
                border-style: groove;
                border-color: red;
                border-radius: 15px;
            }
        </style>
    </head>
    <body>
    <background>
        
    </background>
        <h1>Cadastro de novo jogo</h1>
        
        <form action="#" method="post">
            
            <select name="console" required>
                <option value="">Selecione o console</option>
                <option value="Play 1">PlayStation</option>
                <option value="Xbox One">Xbox One</option>
                
            </select>
            <br><br>
            
            <input type="text" name="nome" placeholder="Nome do Jogo" required>
            
            <br><br>
            <input type="number" step="0.01" name="valor" min="0" placeholder="Valor do jogo">
            
            
            <br><br>
            <select name="genero" required>
                <option value="">Selecione o gênero</option>
                <option value="Aventura">Aventura</option>
                <option value="Ação">Ação</option>
                <option value="Esporte">Esporte</option>
                
            </select>
            
            <br><br>
            <input type="file" name="imagem">
            
            
            <br><br>
            <input type="submit" value="Cadastrar jogo!">
            
            
            
        </form>
        <br><br>
        <a href="home.jsp" title="Página inicial">Página inicial</a>
    </body>
</html>
