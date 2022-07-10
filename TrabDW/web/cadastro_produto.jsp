<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Cadastro produto</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="styles.css">
</head>

<body>
    <h1>Cadastrar Produto:</h1>
    <br>
    <form>
        <div class="form-group">
            <label for="inputNomeProduto">RazÃ£o social</label>
            <input type="text" class="form-control inputCurto" id="inputNomeProduto"
                placeholder="Insira o nome do produto aqui" required>
        </div>
        <div class="form-group">
          <label for="inputDescricaoProduto">DescriÃ§Ã£o</label>
          <textarea rows="3" class="form-control inputLongo" id="inputDescricaoProduto" placeholder="Descreva o produto aqui" required></textarea>
        </div>
        <div class="form-group">
          <label for="inputPreÃ§oCompraProduto">PreÃ§o de compra</label>
          <input type="number" class="form-control inputCurto" id="inputPreÃ§oCompraProduto" placeholder="Insira o preÃ§o de compra aqui" required min="0" step="0.01" data-number-to-fixed="2">
        </div>
        <div class="form-group">
          <label for="inputPreÃ§oVendaProduto">PreÃ§o de venda</label>
          <input type="number" class="form-control inputCurto" id="inputPreÃ§oVendaProduto" placeholder="Insira o preÃ§o de venda aqui" required min="0" step="0.01" data-number-to-fixed="2">
        </div>
        <div class="form-group">
          <label for="inputQuantidadeDisponivelProduto">Quantidade disponÃ­vel</label>
          <input type="number" class="form-control inputCurto" id="inputQuantidadeDisponivelProduto" placeholder="Insira a quantidade disponÃ­vel aqui" required>
        </div>
        <div class="form-group">
          <label for="inputLiberadoVendaProduto">Venda Liberada?</label>
          <input type="checkbox" class="form-control inputCurto" id="inputLiberadoVendaProduto" required>
        </div>
        <div class="form-group">
          <label for="idCategProduto">ID da categoria do produto</label>
          <input type="text" class="form-control inputCurto" id="idCategProduto" placeholder="Insira o id da categoria aqui" required>
      </div>
        <br> <br>
        <button type="submit" class="btn btn-primary">Cadastrar</button>
    </form>

    <script src="jquery-3.4.1.min.js"></script>
    <script src="popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</body>

</html>