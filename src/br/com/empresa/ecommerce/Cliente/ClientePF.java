package br.com.empresa.ecommerce.Cliente;

public class ClientePF extends Cliente {
    private String cpf;

    public ClientePF(String nome, String endereco, String email, String cpf) {
        super(nome, endereco, email);
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }
}
