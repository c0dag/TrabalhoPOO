package br.com.empresa.ecommerce;

import br.com.empresa.ecommerce.Cliente.Cliente;
import br.com.empresa.ecommerce.Cliente.ClientePF;
import br.com.empresa.ecommerce.Cliente.ClientePJ;
import br.com.empresa.ecommerce.Cliente.CriarConta;
import br.com.empresa.ecommerce.Produto.Produto;
import br.com.empresa.ecommerce.Pedidos.Pedidos;
import br.com.empresa.ecommerce.Interfaces.*;

public class Main {
    public static void main(String[] args) throws Exception {

        CriarConta criarConta = new CriarConta();
        
        Cliente cliente1 = criarConta.criarConta("PF", "abu", "logo ali", "abu@mail.com", "12345678901");
        
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Endereço: " + cliente1.getEndereco());
        System.out.println("Email: " + cliente1.getEmail());
        
        String tipoConta = "";
        if (cliente1 instanceof ClientePF) {
            tipoConta = "PF";
            ClientePF clientePF = (ClientePF) cliente1;
            System.out.println("CPF: " + clientePF.getCpf());
        } 
        else if (cliente1 instanceof ClientePJ) {
            tipoConta = "PJ";
            ClientePJ clientePJ = (ClientePJ) cliente1;
            System.out.println("CNPJ: " + clientePJ.getCnpj());
        }
        
        System.out.println("Tipo de Conta: " + tipoConta);

        Produto produto1 = new Produto("BONECO AMBALABU", 10, 3);
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço: R$ " + produto1.getPreco());
        System.out.println("Estoque inicial: " + produto1.getEstoque());
        
        Pedidos pedido1 = new Pedidos(cliente1);

        pedido1.adicionarProduto(produto1, 3);
        System.out.println("Cliente do pedido: " + pedido1.getCliente().getNome());

        System.out.println("Estoque restante: " + produto1.getEstoque());

        
        pedido1.setFormaPagamento(new Pix()); 
        pedido1.setTipoEntrega(new EntregaRapida());

        double valorComDesconto = pedido1.getFormaPagamento().calcularValorFinal(pedido1.getValorTotal());
        double frete = pedido1.getTipoEntrega().calcularFrete();
        double total = valorComDesconto + frete;

        System.out.println("Forma de pagamento: " + pedido1.getFormaPagamento().tipoPagamento());
        if (pedido1.getFormaPagamento() instanceof Pix) {
        System.out.println("Desconto (15% PIX): R$ " + (pedido1.getValorTotal() - valorComDesconto));
        }
        System.out.println("Entrega: " + pedido1.getTipoEntrega().tipoEntrega());
        System.out.println("Frete: R$ " + frete);
        System.out.println("TOTAL A PAGAR: R$ " + total); 

    }
}