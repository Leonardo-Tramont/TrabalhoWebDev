<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Login</title>
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="styles.css">
</head>

<body>
  <br>
  <h2>Fazer login</h2>
  <br>
  <form method="POST" action="ProcessaLogin">
    <div class="form-group">
      <label for="inserirCpf1">CPF</label>
      <input type="text" class="form-control inputCurto " name="inserirCpf1" id="inserirCpf1" aria-describedby="emailHelp"
        placeholder="000.000.000-00">
    </div>
    <div class="form-group">
      <label for="inserirSenha1">Senha</label>
      <input type="password" class="form-control inputCurto " name="inserirSenha1" id="inserirSenha1" placeholder="inserir senha aqui">
    </div>
    <button type="submit" class="btn btn-primary" id="botaoLogin">Entrar</button>
  </form>

  <script src="jquery-3.4.1.min.js"></script>
  <script src="popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="script.js"></script>
</body>

</html>
