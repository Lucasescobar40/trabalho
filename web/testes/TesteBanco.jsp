<%@page import="model.MyConnection"%>
<%
    if(MyConnection.getConnection() != null) {
        out.print("Conexão bem sucedida!");
        out.print("<br>Nome do banco de dados: " 
                                    + MyConnection.getConnection().getCatalog());        
    } else {
        out.print("Erro de conexão!");
    }
    
%>