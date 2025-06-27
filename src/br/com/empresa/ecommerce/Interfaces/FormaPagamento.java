package br.com.empresa.ecommerce.Interfaces;

public interface FormaPagamento {
    String tipoPagamento();
    double calcularValorFinal(double valor);
}
