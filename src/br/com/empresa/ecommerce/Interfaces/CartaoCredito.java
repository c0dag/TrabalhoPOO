package br.com.empresa.ecommerce.Interfaces;

public class CartaoCredito implements FormaPagamento {
    @Override
    public String tipoPagamento() {
        return "Cartão de Crédito";
    }

    @Override
    public double calcularValorFinal(double valor) {
        return valor;
    }
}
