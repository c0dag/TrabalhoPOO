package br.com.empresa.ecommerce.Cliente;

public class CriarConta {
    private String tipo;

    public Cliente criarConta(String tipo, String nome, String endereco, String email, String identificador) {
        if (tipo.equalsIgnoreCase("PJ")) {
            return new ClientePJ(nome, endereco, email, identificador);
        } else if (tipo.equalsIgnoreCase("PF")) {
            return new ClientePF(nome, endereco, email, identificador);
        } else {
            throw new IllegalArgumentException("Tipo de cliente inválido");
        }
    }
}
