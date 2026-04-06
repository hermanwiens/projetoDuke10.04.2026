package ecommerce.pagamento;

// [Exceção Customizada] – Erros específicos do processo de pagamento
public class PagamentoException extends Exception {

    public PagamentoException(String mensagem) {
        super(mensagem);
    }
}
