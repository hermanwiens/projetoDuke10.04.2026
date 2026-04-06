package ecommerce;

import ecommerce.model.*;
import ecommerce.pagamento.*;

// Classe principal do sistema
public class Main {

    public static void main(String[] args) {

        Produto camisa = new Camisa("Camiseta Duke Java", 59.90, "G");

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(camisa);

        Pedido pedido = new Pedido(carrinho);

        MetodoPagamento pagamento = new PagamentoCartao();

        pedido.fecharPedido(pagamento);
    }
}
