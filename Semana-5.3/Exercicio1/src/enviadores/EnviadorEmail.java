package enviadores;

public class EnviadorEmail implements IEnviadorMensagem{
    @Override
    public void enviarMensagem(String contato, String mensagem){
        System.out.println("enviando a mensagem : "+ mensagem + ", para o email: " +contato);
    }
}
