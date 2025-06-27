package br.com.empresa.ecommerce.Pedidos;
import java.util.ArrayList;
import br.com.empresa.ecommerce.Produto.Produto;
import br.com.empresa.ecommerce.Cliente.Cliente;
import br.com.empresa.ecommerce.Interfaces.*;


public class Pedidos {
    private ArrayList<Produto> produtos;
    private Cliente cliente;
    private int valorTotal;
    private FormaPagamento formaPagamento; 
    private Entrega tipoEntrega; 

    public Pedidos(Cliente cliente){
    this.cliente = cliente;
    this.produtos = new ArrayList<>();
    this.valorTotal = 0;
    }
    
    public void adicionarProduto(Produto produto, int quantidade) {
        produto.venderItem(quantidade);
        produtos.add(produto);
        valorTotal += produto.getPreco() * quantidade;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setTipoEntrega(Entrega tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public double calcularTotal() {
        double valorProdutos = valorTotal;
        double valorComDesconto = formaPagamento.calcularValorFinal(valorProdutos);
        double frete = tipoEntrega.calcularFrete();
        return valorComDesconto + frete;
    }

    public int getValorTotal() {
        return valorTotal;
    }
    
    //GETTERS
    public FormaPagamento getFormaPagamento() { return formaPagamento; }
    public Entrega getTipoEntrega() { return tipoEntrega; }
    public ArrayList<Produto> getProdutos() { return produtos; }

}
