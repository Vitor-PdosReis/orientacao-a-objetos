package pagamentos;

public class ProcessadorPagamentoCartao implements IProcessadorPagamento {
    @Override
    public void processarPagamento(int numero, double valorPago){
        System.out.println("Processando pagamento no valor:R$ "+valorPago + ", do cartao de numero: " + numero);
    }
}
