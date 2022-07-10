<%@page import="model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="styles.css">
  <title>Cadastro cliente</title>
</head>

<body>
  <%
  Cliente cliente = (Cliente) request.getAttribute("ClienteBuscado");
  String id = String.valueOf(cliente.getId());
  String str = "aaaaaaaa";
  %>
    
  <h1>Editar cliente: </h1>
  <br>
  <form method="POST" action="EditaCliente">
    <div class="form-group">
      <label for="IdCliEdi">ID</label>
      <input type="text" class="form-control inputCurto" name="IdCliEdi" id="IdCliEdi" value=<%=id%> required>
    </div>
    <div class="form-group">
      <label for="nomeCliEdi">Nome</label>
      <input type="text" class="form-control inputCurto" name="nomeCliEdi" id="nomeCliEdi" value=<%=cliente.getNome()%> required>
    </div>
    <div class="form-group">
      <label for="cpfCliEdi">CPF</label>
      <input type="text" class="form-control inputCurto" name="cpfCliEdi" id="cpfCliEdi" value=<%=cliente.getCpf()%> required>
    </div>
    <div class="form-group">
      <label for="endCliEdi">Endereço</label>
      <input type="text" class="form-control inputCurto" name="endCliEdi" id="endCliEdi" value=<%=cliente.getEndereco()%> required>
    </div>
    <div class="form-row">
      <div class="form-group col-md-2">
        <label for="bairroCliEdi">Bairro</label>
        <input type="text" class="form-control inputDark" name="bairroCliEdi" id="bairroCliEdi"  value=<%=cliente.getBairro()%> required>
      </div>
      <div class="form-group col-md-2">
        <label for="cidadeCliEdi">Cidade</label>
        <input type="text" class="form-control inputDark" name="cidadeCliEdi" id="cidadeCliEdi" value=<%=cliente.getCidade()%> required>
      </div>
      <div class="form-group col-md-1">
        <label for="estadoCliEdi">UF</label>
        <input type="text" class="form-control inputDark" name="estadoCliEdi" id="estadoCliEdi" value=<%=cliente.getUf()%> required>
      </div>
    </div>
    <div class="form-group">
      <label for="cepCliEdi">Cep</label>
      <input type="text" class="form-control inputCurto" id="cepCliEdi" name="cepCliEdi" value=<%=cliente.getCep()%> required>
    </div>
    <div class="form-group">
      <label for="telCliEdi">Telefone</label>
      <input type="tel" class="form-control inputCurto" id="telCliEdi" name="telCliEdi" value=<%=cliente.getTelefone()%> required>
    </div>
    <div class="form-group">
      <label for="emailCliEdi">E-mail</label>
      <input type="email" class="form-control inputCurto" id="emailCliEdi" name="emailCliEdi" value=<%=cliente.getEmail()%> required>
    </div>
    <br> <br>
    <button type="submit" class="btn btn-primary">Cadastrar</button>
  </form>

  <script src="jquery-3.4.1.min.js"></script>
  <script src="popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
</body>
</html>
