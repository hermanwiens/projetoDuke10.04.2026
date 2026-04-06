package ecommerce.pagamento;

// [Classe] – Implementa a interface MetodoPagamento
public class PagamentoCartao implements MetodoPagamento {

    @Override // [Anotação]
    public void processar(double valor) throws PagamentoException {
        if (valor <= 0) {
            throw new PagamentoException("Valor inválido para pagamento.");
        }
        System.out.println("Pagamento de R$ " + valor + " realizado com cartão.");
    }
}
