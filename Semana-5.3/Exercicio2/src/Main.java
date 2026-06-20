import pagamentos.IProcessadorPagamento;
import pagamentos.ProcessadorPagamentoBoleto;
import pagamentos.ProcessadorPagamentoCartao;
import servicos.ServicoPagamento;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IProcessadorPagamento processadorBoleto = new ProcessadorPagamentoBoleto();
        ServicoPagamento pagamentoBoleto = new ServicoPagamento(processadorBoleto);
        pagamentoBoleto.realizarPagamento(1545986599, 50.00);

        IProcessadorPagamento processadorCartao = new ProcessadorPagamentoCartao();
        ServicoPagamento pagamentoCartao = new ServicoPagamento(processadorCartao);
        pagamentoCartao.realizarPagamento(157364, 100.00);
    }
}