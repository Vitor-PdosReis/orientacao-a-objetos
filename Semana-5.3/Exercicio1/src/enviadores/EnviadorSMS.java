package enviadores;

public class EnviadorSMS implements IEnviadorMensagem{
    @Override
    public void enviarMensagem(String contato, String mensagem) {
        System.out.println("Enviando SMS: " + mensagem + ", para o numero : " + contato);
    }
}
