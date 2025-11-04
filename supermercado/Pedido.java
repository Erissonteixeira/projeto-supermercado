package supermercado;

import java.util.ArrayList;
import java.util.List;

public class Pedido{

    private List<ItemPedido> itens;

    public Pedido(){
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade){
        ItemPedido item = new ItemPedido(produto, quantidade);
        itens.add(item);
        System.out.println("Item adicionado: " + produto.getNome() + " (x" + quantidade + ")");
    }

    public double calcularTotal(){
        double total = 0;
        for(ItemPedido item : itens){
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void imprimirPedido(){
        System.out.println("\n=== RESUMO DO PEDIDO ===");
        for(ItemPedido item : itens){
            System.out.println(item);
        }
        System.out.println("Total: R$ " + calcularTotal());
    }

    public List<ItemPedido> getItens(){
        return itens;
    }

    public void setItens(List<ItemPedido> itens){
        this.itens = itens;
    }
}
