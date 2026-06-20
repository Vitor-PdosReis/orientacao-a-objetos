package servicos;

import pagamentos.IProcessadorPagamento;

public class ServicoPagamento {
    private IProcessadorPagamento processadorPag;

    public ServicoPagamento(IProcessadorPagamento processadorPag){
        this.processadorPag = processadorPag;
    }

    public void realizarPagamento(int numero,double valorPago){
        processadorPag.processarPagamento(numero, valorPago);
    }
}
