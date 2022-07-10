<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="styles.css">
    <title>Cadastro categoria</title>
</head>

<body>
    <h1>Cadastrar categoria:</h1>
    <br>
    <form>
        <div class="form-group">
            <label for="inputCateg">Categoria</label>
            <input type="text" class="form-control inputCurto" id="inputCateg"
                placeholder="Insira a categoria aqui" required>
        </div>
        <br> <br>
        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>

    <script src="jquery-3.4.1.min.js"></script>
    <script src="popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>

</html>