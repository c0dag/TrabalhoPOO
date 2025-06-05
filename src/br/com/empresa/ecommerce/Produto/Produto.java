package br.com.empresa.ecommerce.Produto;

public class Produto {
    private String nome;
    private int preco;
    private int estoque;

    public Produto(String nome, int preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void venderItem(int quantidade){
        if (estoque < quantidade){
            throw new IllegalArgumentException("Estoque insuficiente! Disponível: " + estoque);
        }
        else {
            estoque = estoque - quantidade;
        }
    }

    



    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public boolean temEstoque() {
        return estoque > 0;
    }

}
