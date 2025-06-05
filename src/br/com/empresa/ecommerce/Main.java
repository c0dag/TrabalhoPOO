package br.com.empresa.ecommerce;

import br.com.empresa.ecommerce.Cliente.Cliente;
import br.com.empresa.ecommerce.Cliente.ClientePF;
import br.com.empresa.ecommerce.Cliente.ClientePJ;
import br.com.empresa.ecommerce.Cliente.CriarConta;
import br.com.empresa.ecommerce.Produto.Produto;
import br.com.empresa.ecommerce.Pedidos.Pedidos;

public class Main {
    public static void main(String[] args) throws Exception {
        // Criar conta para pessoa física
        CriarConta criarConta = new CriarConta();
        
        Cliente cliente1 = criarConta.criarConta("PF", "Maria Silva", "Rua A, 123", "maria@mail.com", "12345678901");
        
        System.out.println("=== CLIENTE CRIADO ===");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Endereço: " + cliente1.getEndereco());
        System.out.println("Email: " + cliente1.getEmail());
        
        String tipoConta = "";
        if (cliente1 instanceof ClientePF) {
            tipoConta = "PF";
            ClientePF clientePF = (ClientePF) cliente1;
            System.out.println("CPF: " + clientePF.getCpf());
        } else if (cliente1 instanceof ClientePJ) {
            tipoConta = "PJ";
            ClientePJ clientePJ = (ClientePJ) cliente1;
            System.out.println("CNPJ: " + clientePJ.getCnpj());
        }
        
        System.out.println("Tipo de Conta: " + tipoConta);

        // Criar produto
        Produto produto1 = new Produto("BONECO AMBALABU", 10, 3);
        
        System.out.println("\n=== PRODUTO ===");
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço: R$ " + produto1.getPreco());
        System.out.println("Estoque inicial: " + produto1.getEstoque());
        
        // Criar pedido e vender
        Pedidos pedido1 = new Pedidos(cliente1);
        
        System.out.println("\n=== VENDA ===");
        System.out.println("Vendendo 1 unidade de " + produto1.getNome());
        
        pedido1.adicionarProduto(produto1, 4);
        
        System.out.println("Estoque restante: " + produto1.getEstoque());
    }
}