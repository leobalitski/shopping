package main.com.company;

import java.util.ArrayList;
import java.util.List;

class Produto {

    String nome;
    float valor;
    int quantidade = 0;
    List<Carrinho> carrinhoList = new ArrayList<Carrinho>();
    int vendas = 0;

    Produto(String nome, float valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    void venderProduto() {
        vendas++;
    }

    void quantidadeDeVendas() {
        System.out.println("Quantidade de " + nome + " vendidos:" + vendas);
    }
}