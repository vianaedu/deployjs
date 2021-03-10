function login() {
    let user = document.getElementById("txtUser").value
    let senha = document.getElementById("txtSenha").value
    
    let usuario = {
        email:user,
        cpf: user,
        senha:senha
    }

    let mensagem = {
        method: 'POST',
        body: JSON.stringify(usuario),
        headers : {
            'Content-type':'application/json'
        }
    }

    fetch("http://localhost:8080/user/login", mensagem)
        .then(res => validaLogin(res))
}

function validaLogin(resultado) {
    if(resultado.status == 200){
        resultado.json().then(res => efetuaLogin(res))
    }  else {
        document.getElementById("msgError").innerHTML = "usuário / senha invalido"
    }
}

function efetuaLogin(usuario) {
    // console.log("Entrando com " , usuario)
    localStorage.setItem("userLogged", JSON.stringify(usuario))
    window.location = "consulta.html"
}