package supermercado;

import java.util.ArrayList;
import java.util.List;

public class Estoque{

    private List<Produto> produtos;

    public Estoque(){
        this.produtos = new ArrayList<>();
        inicializaEstoque();
    }

    public void inicializaEstoque(){
        produtos.add(new Produto(1, "Arroz 5kg", 22.50));
        produtos.add(new Produto(2, "Feijão 1kg", 7.90));
        produtos.add(new Produto(3, "Macarrão 500g", 5.60));
        produtos.add(new Produto(4, "Açúcar 1kg", 4.30));
        produtos.add(new Produto(5, "Café 500g", 12.80));
    }

    public Produto encontraProduto(String nome){
        for(Produto produto : produtos){
            if(produto.getNome().equalsIgnoreCase(nome)){
                return produto;
            }
        }
        return null;
    }

    public void darBaixaEmEstoque(String nome, int quantidade){
        Produto produtoEncontrado = encontraProduto(nome);
        if(produtoEncontrado != null){
            produtos.remove(produtoEncontrado);
            System.out.println("Produto '" + nome + "' removido do estoque.");
        } else{
            System.out.println("Produto '" + nome + "' não encontrado no estoque.");
        }
    }

    public void imprimeCatalogoDoEstoque(){
        System.out.println("=== CATÁLOGO DO ESTOQUE ===");
        for (Produto produto : produtos){
            System.out.println(produto);
        }
    }

    public List<Produto> getProdutos(){
        return produtos;
    }

    public void setProdutos(List<Produto> produtos){
        this.produtos = produtos;
    }
}
