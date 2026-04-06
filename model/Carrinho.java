package ecommerce.model;

import java.util.ArrayList;
import java.util.List;

// [Agregação] – O carrinho agrega produtos
public class Carrinho {

    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        return produtos.stream()
                       .mapToDouble(Produto::getPreco)
                       .sum();
    }
}
