package br.com.empresa.ecommerce;

import br.com.empresa.ecommerce.Cliente.Cliente;
import br.com.empresa.ecommerce.Cliente.ClientePF;
import br.com.empresa.ecommerce.Cliente.ClientePJ;
import br.com.empresa.ecommerce.Cliente.CriarConta;

public class Main {
    public static void main(String[] args) throws Exception {
        CriarConta criarConta = new CriarConta();
        
        Cliente cliente1 = criarConta.criarConta("PJ", "João Silva", "Rua A, 123", "teste@mail.com", "12345678900");
        
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
    }
}