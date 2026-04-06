package ecommerce.pagamento;

// [Interface] – Contrato comum para qualquer forma de pagamento
public interface MetodoPagamento {

    void processar(double valor) throws PagamentoException;

}
