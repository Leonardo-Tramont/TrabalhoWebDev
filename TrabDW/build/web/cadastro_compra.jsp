<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="styles.css">
    <title>Cadastro compra</title>
</head>

<body>
    <h1>Cadastrar Compra:</h1>
    <br>
    <form>
        <div class="form-group">
            <label for="inputQuantCompra">Quantidade comprada</label>
            <input type="text" class="form-control inputCurto" id="inputQuantCompra"
                placeholder="Insira a quantidade aqui" required>
        </div>
        <div class="form-group">
            <label for="inputDataCompra">Data da Compra</label>
            <input type="text" class="form-control inputCurto" id="inputDataCompra" placeholder="Insira a data aqui" required>
        </div>
        <div class="form-group">
            <label for="inputValCompra">Valor da Compra</label>
            <input type="number" class="form-control inputCurto" id="inputValCompra" placeholder="Insira o valor aqui" required>
        </div>
        <div class="form-group">
            <label for="idfornecedor">ID do fornecedor</label>
            <input type="text" class="form-control inputCurto" id="idfornecedor" placeholder="Insira o id aqui" required>
        </div>
        <div class="form-group">
            <label for="idProdCompra">ID do produto comprado</label>
            <input type="text" class="form-control inputCurto" id="idProdCompra" placeholder="Insira o id aqui" required>
        </div>
        <div class="form-group">
            <label for="idFuncCompra">ID do funcionario</label>
            <input type="text" class="form-control inputCurto" id="idFuncCompra" placeholder="Insira o id aqui" required>
        </div>
        <br> <br>
        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>

    <script src="jquery-3.4.1.min.js"></script>
    <script src="popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>

</html>