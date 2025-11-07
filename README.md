### SuperMercadoProva 🛒
Descrição do Projeto

O projeto SuperMercadoProva tem como objetivo simular um sistema de gerenciamento de vendas em um supermercado.
O sistema permite cadastrar produtos, gerenciar estoque, criar pedidos, calcular o valor total da compra e emitir o troco com notas detalhadas.

Foi desenvolvido em Java, aplicando os princípios de orientação a objetos como encapsulamento, composição e responsabilidade única.

---
### Funcionalidades Principais

📦 Controle de Estoque: armazenamento e listagem dos produtos disponíveis.

🧾 Gestão de Pedidos: criação de pedidos contendo múltiplos itens.

💰 Cálculo Automático do Total: soma de subtotais dos produtos.

💵 Cálculo de Troco: retorna o valor e a quantidade de notas necessárias.

🖨️ Impressão do Pedido: exibe um resumo completo da compra no console.

🧠 Validações Simples: impede adição de produtos inexistentes.

--- 
```
supermercado/
│
├── Produto.java         # Representa um produto do estoque (id, nome, preço, quantidade)
├── ItemPedido.java      # Associa produto e quantidade dentro de um pedido
├── Pedido.java          # Gerencia lista de itens e realiza cálculos de total/troco
├── Estoque.java         # Armazena e gerencia produtos disponíveis
└── SuperMercadoApp.java # Classe principal com menu interativo
```
---
### Fluxo do Programa

1- O usuário inicia o sistema pelo console.

2- É exibido um menu com opções:

- Ver catálogo de produtos

- Adicionar item ao pedido

- Ver resumo do pedido

- Finalizar compra e calcular troco

3- Ao finalizar a compra, o sistema:

- Calcula o total do pedido

- Solicita o valor pago pelo cliente

- Calcula o troco e mostra a decomposição em notas

--- 
### Exemplo de Execução (Simulação)
``` java json xml html
=== BEM-VINDO AO SUPERMERCADO ===

1 - Ver catálogo
2 - Adicionar item ao pedido
3 - Ver resumo do pedido
4 - Finalizar compra
0 - Sair

Escolha: 2
Digite o ID do produto: 3
Digite a quantidade: 2
Item adicionado: Arroz (x2)

=== RESUMO DO PEDIDO ===
Arroz - R$ 10.00 x2 = R$ 20.00
Total: R$ 20.00

Digite o valor pago: 50
Troco: R$ 30.00
1 nota(s) de R$ 20
1 nota(s) de R$ 10
```
---
### Principais Métodos Implementados
``` java bash
public double calcularTotal()
```
➡️ Soma o valor de todos os itens do pedido, multiplicando o preço pela quantidade.
``` java bash
public double calcularTroco(double valorPago)
```
➡️ Retorna a diferença entre o valor pago e o total do pedido.
``` java bash
public void calcularNotasTroco(double troco)
```
➡️ Exibe a decomposição do troco em notas (100, 50, 20, 10, 5, 2 e 1)

---
### Tecnologias Utilizadas
- ☕ Java 17+
- 🧠 Paradigma Orientado a Objetos (POO)
- 🖥️ Console (Scanner) para entrada de dados
- 🗂️ Collections (List / ArrayList)
--- 

### Autor / Desenvolvedor

- 👨‍💻 Projeto desenvolvido por Erisson Teixeira
- 💬 Foco em lógica, POO e boas práticas em Java
--- 



