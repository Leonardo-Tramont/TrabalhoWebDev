<%@page import="model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*, model.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="styles.css">
        <title>ClientesView</title>
    </head>
    <body>
        <h1>Clientes cadastrados: </h1>
        
        <div class="tabela-clientes"> 
            <table class="table table-dark table-hover">
                <thead>
                    <tr>
                        <th scope="col">id</th>
                        <th scope="col">nome</th>
                        <th scope="col">cpf</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        ArrayList<Cliente> clientes = (ArrayList<Cliente>) request.getAttribute("ClientesCadastrados");
                        for (int i = 0; i < clientes.size(); i++) {
                            Cliente aux = clientes.get(i);
                    %>
                    <tr>
                        <td><%=aux.id%></td>
                        <td><%=aux.nome%></td>
                        <td>@<%=aux.cpf%></td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
                
        <script src="jquery-3.4.1.min.js"></script>
        <script src="popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
