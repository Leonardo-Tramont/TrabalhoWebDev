/* document.getElementById("exampleCheck1").onclick = function() {cpfMask()};

function cpfMask() {
    var cpf = document.getElementById("inserirCpf1").value;
    cpf = cpf.replace(/^(\d{3})(\d{3})(\d{3})(\d{2})/, "$1.$2.$3-$4")
    console.log(cpf);
} */

document.getElementById("button1").onclick = function() {redirect()};

function redirect() {
    location.href='entrada.html';
}