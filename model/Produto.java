
package ecommerce.model;

// [Classe Abstrata] – Representa um produto genérico do sistema
public abstract class Produto {

    private String nome;     // [Encapsulamento]
    private double preco;

    // [Construtor]
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // [Método Abstrato]
    public abstract void exibirDetalhes();
}
