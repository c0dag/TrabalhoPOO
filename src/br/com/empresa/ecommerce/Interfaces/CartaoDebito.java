package br.com.empresa.ecommerce.Interfaces;

public class CartaoDebito implements FormaPagamento {
    @Override
    public String tipoPagamento() {
        return "Cartão de Débito";
    }

    @Override
    public double calcularValorFinal(double valor) {
        return valor;
    }
}
