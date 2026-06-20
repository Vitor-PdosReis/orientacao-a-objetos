package enviadores;

public class EnviadorTelegram implements IEnviadorMensagem{
    @Override
    public void enviarMensagem(String contato, String mensagem) {
        System.out.println("Enviando mensagem telegram: " + mensagem + ", para o contato : " + contato);
    }
}
