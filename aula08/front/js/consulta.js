/*function hello() {
    let numero
    numero = document.getElementById("chave").value
    let saida = document.getElementById("saida")
    saida.innerHTML = "Voce digitou: " + numero
    console.log('Voce digitou: ' + numero)
} */

function validaLogin() {
    let usuario = localStorage.getItem("userLogged")

    if (!usuario) {
        window.location = "login.html"
    }
    
    let objUser = JSON.parse(usuario)

    document.getElementById("dadosUser").innerHTML = 'Usuário: <b>' + objUser.nome + '</b> - ' + objUser.email + '<br>'
}

function logout() {
    localStorage.removeItem("userLogged");
    window.location = "login.html"
    
}

function consultaUsuario() {
    let numero
    numero = document.getElementById("chave").value

    const url= "http://localhost:8080/user/compras/" + numero

    fetch(url)
    .then(res => validaResposta(res))

}

function validaResposta(resultado) {
    
    if (resultado.status == 200) {
        resultado.json().then(res => exibirDados(res))
     
    } else {
        document.getElementById("saida").innerHTML = "Não Encontrado"

    }
}

function exibirDados(compras){
    let tabela = '<table> <tr> <th>Descrição</th> <th>Valor</th> <th>Data</th> </tr>'

    for(let index = 0; index < compras.length; index++) {
        let data = new Date(compras[index].data) // tranforma o texto em um objeto Date
        let dataFormatada = data.toLocaleDateString("pt-BR");
      // tabela += '<tr> <td>' +compras[index].descricao + '</td><td>' + compras[index].valor + '</td><td>' + compras[index].data + '</td></tr>'
        tabela += `<tr> <td> ${compras[index].descricao} </td><td> ${compras[index].valor} </td><td> ${dataFormatada}</td></tr>`
            
    }

    tabela += '</table>'

    document.getElementById("saida").innerHTML = tabela
}