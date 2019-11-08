package main.com.company;

import java.util.ArrayList;
import java.util.List;

class Carrinho {
    String dataDaCompra;
    Cliente cliente;
    List<Produto> produtoList = new ArrayList<Produto>();
    float valorTotal = 0;
    float valorComDesconto = 0;

    Carrinho(String dataDaCompra, Cliente cliente) {
        this.dataDaCompra = dataDaCompra;
        this.cliente = cliente;
    }

    void valorTotal() {
        for (Produto produto : produtoList) {
            valorTotal += produto.valor;
        }
        System.out.println("Valor total do carrinho:" + valorTotal);
    }

    void valorComDesconto() {
        valorComDesconto = valorTotal - (valorTotal * (cliente.desconto / 100));
        System.out.println("O valor com desconto é: " + valorComDesconto);
    }

    void adicinarProdutoNoCarrinho(Produto produto) {
        produtoList.add(produto);
    }

    void fazerCheckoutNoCarrinho() {
        for (Produto produto : produtoList) {
            cliente.nomeDosProdutosAdquiridos.add(produto.nome);
            produto.venderProduto();
        }
    }
}