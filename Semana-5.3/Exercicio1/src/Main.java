import enviadores.EnviadorEmail;
import enviadores.EnviadorSMS;
import enviadores.EnviadorTelegram;
import enviadores.IEnviadorMensagem;
import service.ProcessadorMensagem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IEnviadorMensagem iEnviadorEmail = new EnviadorEmail();
        ProcessadorMensagem processarEmail = new ProcessadorMensagem(iEnviadorEmail);
        processarEmail.processar("joazinho@gmail.com","Boa tarde joaozinho, você foi aprovado!");

        IEnviadorMensagem iEnviadorSMS = new EnviadorSMS();
        ProcessadorMensagem processarSMS = new ProcessadorMensagem(iEnviadorSMS);
        processarSMS.processar("3299454521", "Boa tarde Maria, voce foi aprovada!");

        IEnviadorMensagem iEnviadorTelegram = new EnviadorTelegram();
        ProcessadorMensagem processarTelegram = new ProcessadorMensagem(iEnviadorTelegram);
        processarTelegram.processar("3295945412", "Boa tarde Luan, voce foi aprovado!");
    }
}