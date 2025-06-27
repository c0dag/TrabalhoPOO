package br.com.empresa.ecommerce.Interfaces;

public class Pix implements FormaPagamento {
    @Override
    public String tipoPagamento() {
        return "PIX";
    }

    @Override
    public double calcularValorFinal(double valor) {
        return valor * 0.85; // 15% de desconto
    }
}
