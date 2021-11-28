function autenticaNumero(value) {
    //verifica se o campo está vazio
    if (value.trim() !== "") {
        var regra = /^[0-9]+$/;
        //valida se o valor do input é um número.
        if (value.match(regra)) {
            //verifica se o valor esta de acordo com a regra.
        } else {
            alert("Permitido somente numeros");
        }
    }
}

function autenticaLetra(value) {
    if (value.trim() !== "") {
        var regra = /^[a-zA-Z]+$/;
        if (value.match(regra)) {
            //valida para verificar se o usuario esta de acordo com a regra de nao letras.
        } else {
            alert("Permitido somente letras");
        }
    }
}
