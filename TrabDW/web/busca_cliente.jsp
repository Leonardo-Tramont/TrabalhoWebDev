<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="styles.css">
  <title>Buscar de cliente</title>
</head>

<body>
  <h1>Buscar cliente: </h1>
  <br>
  <form method="POST" action="BuscaCliente">
    <div class="form-group">
        <label for="idCliBus">ID</label>
        <input type="text" class="form-control inputCurto" name="idCliBus" id="idCliBus" placeholder="ID do cliente que deseja buscar" required>
        <br> <br>
        <button type="submit" class="btn btn-primary">Buscar</button>
    </div>
  </form>
  
  <script src="jquery-3.4.1.min.js"></script>
  <script src="popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
</body>

</html>
