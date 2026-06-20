package pagamentos;

public class ProcessadorPagamentoBoleto implements IProcessadorPagamento{
    @Override
    public void processarPagamento(int numero, double valorPago){
        System.out.println("Processando pagamento no valor: R$"+valorPago +", do boleto de numero : "+ numero);
    }
}
