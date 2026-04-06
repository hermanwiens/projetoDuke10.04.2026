package ecommerce.model;

// [Associação] – Cliente utiliza Pedido
public class Cliente {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void realizarPedido(Pedido pedido) {
        System.out.println("Cliente " + nome + " realizou um pedido.");
    }
}
