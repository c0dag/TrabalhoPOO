package br.com.empresa.ecommerce.Interfaces;

public class EntregaRapida implements Entrega {
    @Override
    public String tipoEntrega() {
        return "Entrega Rápida";
    }

    @Override
    public double calcularFrete() {
        return 25.0;
    }
}
