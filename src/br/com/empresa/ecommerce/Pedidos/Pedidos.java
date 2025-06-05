package br.com.empresa.ecommerce.Pedidos;
import java.util.ArrayList;
import br.com.empresa.ecommerce.Produto.Produto;
import br.com.empresa.ecommerce.Cliente.Cliente;


public class Pedidos {
    private ArrayList<Produto> produtos;
    private Cliente cliente;
    private int valorTotal;

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


}
