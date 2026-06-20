package service;

import enviadores.IEnviadorMensagem;

public class ProcessadorMensagem {
    private IEnviadorMensagem iEnviador;

    public ProcessadorMensagem(IEnviadorMensagem iEnviador){
        this.iEnviador = iEnviador;
    }
    public void processar(String contato, String mensagem){
        iEnviador.enviarMensagem(contato,mensagem);
    }
}
