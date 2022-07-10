<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Cadastro venda</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="styles.css">
</head>

<body>
    <h1>Cadastrar vendas:</h1>
    <br>
    <form>
        <div class="form-group">
            <label for="inputQuantVendas">Quantidade vendida</label>
            <input type="text" class="form-control inputCurto" id="inputQuantVendas"
                placeholder="Insira a quantidade aqui" required>
        </div>
        <div class="form-group">
            <label for="inputDataVendas">Data da venda</label>
            <input type="text" class="form-control inputCurto" id="inputDataVendas" placeholder="Insira a data aqui" required>
        </div>
        <div class="form-group">
            <label for="inputValVenda">Valor da venda</label>
            <input type="number" class="form-control inputCurto" id="inputValVenda" placeholder="Insira o valor aqui" required>
        </div>
        <div class="form-group">
            <label for="idCliVendas">ID do cliente comprador</label>
            <input type="text" class="form-control inputCurto" id="idCliVendas" placeholder="Insira o id aqui" required>
        </div>
        <div class="form-group">
            <label for="idProdVendas">ID do produto comprado</label>
            <input type="text" class="form-control inputCurto" id="idProdVendas" placeholder="Insira o id aqui" required>
        </div>
        <div class="form-group">
            <label for="idVendVendas">ID do vendedor</label>
            <input type="text" class="form-control inputCurto" id="idVendVendas" placeholder="Insira o id aqui" required>
        </div>
        <br> <br>
        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>

    <script src="jquery-3.4.1.min.js"></script>
    <script src="popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>

</html>