package main.com.company;

import java.util.ArrayList;
import java.util.List;

class Cliente {

    String nome;
    String dataDeNascimento;
    float desconto;
    List<Carrinho> carrinhoList = new ArrayList<Carrinho>();
    List<String> nomeDosProdutosAdquiridos = new ArrayList<String>();

    Cliente(String nome, String dataDeNascimento, float desconto) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.desconto = desconto;
    }

    void produtosAdquiridos() {

        System.out.println("O usuário " + nome + " adquiriu os produtos abaixo:");
        for (String nomeDosProdutos : nomeDosProdutosAdquiridos) {
            System.out.println(nomeDosProdutos );
        }
    }
}