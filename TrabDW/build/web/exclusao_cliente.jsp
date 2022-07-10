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
  <h1>Editar cliente: </h1>
  <br>
  <form method="POST" action="ExcluiCliente">
    <div class="form-group">
        <label for="idCliExc">ID</label>
        <input type="text" class="form-control inputCurto" name="idCliExc" id="idCliExc" placeholder="ID do cliente que deseja excluir" required>
        <br> <br>
        <button type="submit" class="btn btn-primary">Excluir</button>
    </div>
  </form>

  <script src="jquery-3.4.1.min.js"></script>
  <script src="popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
</body>

</html>
