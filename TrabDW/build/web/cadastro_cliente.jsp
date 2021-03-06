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
  <h1>Cadastrar cliente: (jsp)</h1>
  <br>
  <form method="POST" action="IncluiCliente">
    <!-- <div class="form-group">
              <label for="inputIdCli">ID</label>
              <input type="number" class="form-control inputCurto" id="inputIdCli" placeholder="Insira o ID aqui">
            </div> -->
    <div class="form-group">
      <label for="inputNomeCli">Nome</label>
      <input type="text" class="form-control inputCurto" name="inputNomeCli" id="inputNomeCli" placeholder="Insira o nome aqui" required>
    </div>
    <div class="form-group">
      <label for="inputCpfCli">CPF</label>
      <input type="text" class="form-control inputCurto" name="inputCpfCli" id="inputCpfCli" placeholder="Insira o CPF aqui" required>
    </div>
    <div class="form-group">
      <label for="inputEndCli">Endereço</label>
      <input type="text" class="form-control inputCurto" name="inputEndCli" id="inputEndCli" placeholder="Insira o endereço aqui" required>
    </div>
    <div class="form-row">
      <div class="form-group col-md-2">
        <label for="inputCidadeCli">Bairro</label>
        <input type="text" class="form-control inputDark" name="inputBairroCli" id="inputBairroCli" placeholder="Insira o bairro aqui" required>
      </div>
      <div class="form-group col-md-2">
        <label for="inputEstadoCli">Cidade</label>
        <input type="text" class="form-control inputDark" name="inputCidadeCli" id="inputCidadeCli" placeholder="Insira a cidade aqui" required>
      </div>
      <div class="form-group col-md-1">
        <label for="inputCepCli">UF</label>
        <select name="inputEstadoCli" id="inputEstadoCli" class="form-control inputDark" required>
          <option selected disabled hidden>Selecione...</option>
          <option value="AC">AC</option>
          <option value="AL">AL</option>
          <option value="AP">AP</option>
          <option value="AM">AM</option>
          <option value="BA">BA</option>
          <option value="CE">CE</option>
          <option value="DF">DF</option>
          <option value="ES">ES</option>
          <option value="GO">GO</option>
          <option value="MA">MA</option>
          <option value="MT">MT</option>
          <option value="MS">MS</option>
          <option value="MG">MG</option>
          <option value="PA">PA</option>
          <option value="PB">PB</option>
          <option value="PR">PR</option>
          <option value="PE">PE</option>
          <option value="PI">PI</option>
          <option value="RJ">RJ</option>
          <option value="RN">RN</option>
          <option value="RS">RS</option>
          <option value="RO">RO</option>
          <option value="RR">RR</option>
          <option value="SC">SC</option>
          <option value="SP">SP</option>
          <option value="SE">SE</option>
          <option value="TO">TO</option>
        </select>
      </div>
    </div>
    <div class="form-group">
      <label for="inputCepCli">Cep</label>
      <input type="text" class="form-control inputCurto" id="inputCepCli" name="inputCepCli" placeholder="Insira o cep aqui" required>
    </div>
    <div class="form-group">
      <label for="inputTelCli">Telefone</label>
      <input type="tel" class="form-control inputCurto" id="inputTelCli" name="inputTelCli" placeholder="Insira o telefone aqui" required>
    </div>
    <div class="form-group">
      <label for="inputEmailCli">E-mail</label>
      <input type="email" class="form-control inputCurto" id="inputEmailCli" name="inputEmailCli" placeholder="Insira o e-mail aqui" required>
    </div>
    <br> <br>
    <button type="submit" class="btn btn-primary">Cadastrar</button>
  </form>

  <script src="jquery-3.4.1.min.js"></script>
  <script src="popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
</body>

</html>