
let numeroSecreto = Math.floor(Math.random() * 10);
let tentativas = 3;

function jogar(){
    var jogar = document.getElementById('chute');

    var chute = jogar.value;
    if (tentativas > 1){
        if (numeroSecreto == chute){
            mostrarMensagem('Acertou!!!');
            return;
        }else if (chute > numeroSecreto){
            mostrarMensagem("Errou!!! O numero secreto é menor.");
        }else{
            mostrarMensagem("Errou!!! O numero secreto é maior.");
        }
        tentativas -= 1;
        mostrarMensagem("Você ainda tem " +tentativas+ " tentativa(s)" );
    }else {
        mostrarMensagem(" Errou, suas tentativas acabaram. O número secreto era: " + numeroSecreto);
        document.getElementById('chute').value = ' ';
    }

}

function mostrarMensagem(resultado){
     const mensagem = '<h2>'+resultado+'</h2>';
     $('#resultado').append(mensagem);
     $('#resultado').fadeTo(5000, 500).slideUp(1000, function(){
         $('#resultado').slideUp(500);
         $('#resultado').show();
         $('#resultado').html('');
         document.getElementById('chute').value = ' ';
         document.getElementById('chute').focus();
     });
}
