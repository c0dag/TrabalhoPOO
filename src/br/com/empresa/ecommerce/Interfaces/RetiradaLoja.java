package br.com.empresa.ecommerce.Interfaces;

public class RetiradaLoja implements Entrega {
    @Override
    public String tipoEntrega() {
        return "Retirada na Loja";
    }

    @Override
    public double calcularFrete() {
        return 0.0;
    }
}
