package ecommerce.model;

import ecommerce.enums.StatusPedido;
import ecommerce.pagamento.MetodoPagamento;
import ecommerce.pagamento.PagamentoException;

// [Composição] – Pedido depende do Carrinho
public class Pedido {

    private Carrinho carrinho;
    private StatusPedido status;

    public Pedido(Carrinho carrinho) {
        this.carrinho = carrinho;
        this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
    }

    // [Polimorfismo]
    public void fecharPedido(MetodoPagamento pagamento) {
        try {
            pagamento.processar(carrinho.calcularTotal());
            status = StatusPedido.PAGO;
            System.out.println("Pedido pago com sucesso!");
        } catch (PagamentoException e) {
            System.err.println("Erro no pagamento: " + e.getMessage());
        }
    }
}
