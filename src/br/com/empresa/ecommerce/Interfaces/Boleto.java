package br.com.empresa.ecommerce.Interfaces;

public class Boleto implements FormaPagamento {
    @Override
    public String tipoPagamento() {
        return "Boleto";
    }

    @Override
    public double calcularValorFinal(double valor) {
        return valor;
    }
}
