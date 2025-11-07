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

    public double calcularTroco(double valorPago){
        double total = calcularTotal();
        return valorPago - total;
    }

    public void imprimirPedido(){
        System.out.println("\n=== RESUMO DO PEDIDO ===");
        for(ItemPedido item : itens){
            System.out.println(item);
        }
        System.out.println("Total: R$ " + calcularTotal());
    }
    public void calcularNotasTroco(double troco){
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        System.out.println("Troco: R$ " + troco);
        for(int nota : notas) {
            int qtd = (int) (troco / nota);
            if(qtd > 0){
                System.out.println(qtd + " nota(s) de R$ " + nota);
                troco %= nota;
            }
        }
    }

    public List<ItemPedido> getItens(){
        return itens;
    }

    public void setItens(List<ItemPedido> itens){
        this.itens = itens;
    }
}
