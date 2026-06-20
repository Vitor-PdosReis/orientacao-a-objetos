package pagamentos;

public interface IProcessadorPagamento {
    void processarPagamento(int numero, double valorPago);
}
