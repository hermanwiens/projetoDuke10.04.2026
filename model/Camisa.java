package ecommerce.model;

// [Herança] – Camisa é um tipo específico de Produto
public class Camisa extends Produto {

    private String tamanho;

    public Camisa(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(
            "Camisa: " + getNome() +
            " | Tamanho: " + tamanho +
            " | Preço: R$ " + getPreco()
        );
    }
}
