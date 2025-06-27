package br.com.empresa.ecommerce.Interfaces;

public class EntregaPadrao implements Entrega {
    @Override
    public String tipoEntrega() {
        return "Entrega Padrão";
    }

    @Override
    public double calcularFrete() {
        return 10.0;
    }
}
