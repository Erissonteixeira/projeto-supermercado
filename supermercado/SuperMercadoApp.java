package supermercado;

import java.util.Scanner;

public class SuperMercadoApp{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();
        Pedido pedido = new Pedido();

        System.out.println("=== BEM-VINDO AO SUPERMERCADO ===");

        boolean continuar = true;
        while (continuar){
            System.out.println("\n1 - Ver catálogo");
            System.out.println("2 - Adicionar item ao pedido");
            System.out.println("3 - Ver resumo do pedido");
            System.out.println("0 - Finalizar compra");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    estoque.imprimeCatalogoDoEstoque();
                    break;

                case 2:
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    Produto produto = estoque.encontraProduto(nomeProduto);

                    if(produto != null){
                        System.out.print("Digite a quantidade: ");
                        int quantidade = scanner.nextInt();
                        scanner.nextLine();
                        pedido.adicionarItem(produto, quantidade);
                        estoque.darBaixaEmEstoque(nomeProduto, quantidade);
                    } else{
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    pedido.imprimirPedido();
                    break;

                case 0:
                    continuar = false;
                    System.out.println("Compra finalizada. Obrigado!");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
        scanner.close();
    }
}
