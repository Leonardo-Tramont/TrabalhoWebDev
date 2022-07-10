<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="styles.css">
    <title>Cadastro funcionÃ¡rio</title>
</head>

<body>
    <h1>Cadastrar funcionário:</h1>
    <br>
    <form>
        <div class="form-group">
            <label for="inputNomeFunc">Nome</label>
            <input type="text" class="form-control inputCurto" id="inputNomeFunc" placeholder="Insira o nome aqui">
        </div>
        <div class="form-group">
            <label for="inputCpfFunc">CPF</label>
            <input type="text" class="form-control inputCurto" id="inputCpfFunc" placeholder="Insira o CPF aqui">
        </div>
        <div class="form-group">
            <label for="inputSenhaFunc">Senha</label>
            <input type="password" class="form-control inputCurto" id="inputSenhaFunc"
                placeholder="Insira a senha aqui">
        </div>
        <div class="form-group">
            <label for="inputEmailFunc">E-mail</label>
            <input type="text" class="form-control inputCurto" id="inputEmailFunc" placeholder="Insira o e-mail aqui">
        </div>
        <div class="form-group">
            <label for="inputPapelCli">Papel do funcionÃ¡rio</label>
            <select id="inputPapelCli" class="form-control inputCurto2">
                <option selected disabled>0 = admin, 1 = vendedor, 2 = comprador</option>
                <option>0</option>
                <option>1</option>
                <option>2</option>
            </select>
        </div>
        <br> <br>
        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>

    <script src="jquery-3.4.1.min.js"></script>
    <script src="popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>

</html>