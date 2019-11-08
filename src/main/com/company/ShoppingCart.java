package main.com.company;

public class ShoppingCart {

    public static void main(String[] args) {

        //Desconto -> 20 = 20%, 15 = 15%...
        Cliente cliente1 = new Cliente("Leonardo", "18/08/1997", 20);

        Cliente cliente2 = new Cliente("Victor", "23/07/1997", 10);

        Cliente cliente3 = new Cliente("Bruno", "01/06/1997", 15);

        Cliente cliente4 = new Cliente("Willian", "05/07/1997", 9);

        Cliente cliente5 = new Cliente("Eduardo", "20/02/1997", 30);


        //Valor -> 3000 = R$30,00, 30000 = R$300,00...
        Produto produto1 = new Produto("Teclado", 3000, 20);

        Produto produto2 = new Produto("Mouse", 1000, 15);

        Produto produto3 = new Produto("HeadSet", 20000, 15);

        Produto produto4 = new Produto("MousePad", 5600, 15);

        Produto produto5 = new Produto("Monitor", 40000, 15);

        Produto produto6 = new Produto("Gabinete", 80000, 15);

        Produto produto7 = new Produto("Suporte Notbook", 50000, 15);

        Produto produto8 = new Produto("cabo USB", 100, 15);

        Produto produto9 = new Produto("Pendrive", 7000, 15);

        Produto produto10 = new Produto("Adesivos", 100, 15);

        //Cada cliente pode ter multiplos carrinhos, porém cada carrinho tem apenos um cliente
        //1-Cliente -> N-Carrinho
        Carrinho carrinho1 = new Carrinho("23/08/2000", cliente1);

        Carrinho carrinho2 = new Carrinho("23/08/2000", cliente2);

        Carrinho carrinho3 = new Carrinho("23/08/2000", cliente2);

        Carrinho carrinho4 = new Carrinho("23/08/2000", cliente3);

        Carrinho carrinho5 = new Carrinho("23/08/2000", cliente4);

        Carrinho carrinho6 = new Carrinho("23/08/2000", cliente5);


        //Adicionando produtos nos carrinho1
        carrinho1.adicinarProdutoNoCarrinho(produto1);
        carrinho1.adicinarProdutoNoCarrinho(produto2);
        carrinho1.adicinarProdutoNoCarrinho(produto3);
        carrinho1.adicinarProdutoNoCarrinho(produto7);

        //Adicionando produtos do carrinho2
        carrinho2.adicinarProdutoNoCarrinho(produto10);
        carrinho2.adicinarProdutoNoCarrinho(produto8);
        carrinho2.adicinarProdutoNoCarrinho(produto5);

        //Adiciona o nome dos produtos da list produtos adquiridos do cliente
        //Incrementa a quantidade de vendas do produto
        carrinho1.fazerCheckoutNoCarrinho();
        carrinho2.fazerCheckoutNoCarrinho();

        //Apresenta os nome dos produtos adquiridos por cada cliente
        cliente1.produtosAdquiridos();

        //Valor total do carrinho sem desconto
        carrinho1.valorTotal();

        //Valor com desconto do cliente
        carrinho1.valorComDesconto();

        cliente2.produtosAdquiridos();

        carrinho2.valorTotal();

        carrinho2.valorComDesconto();

        //Mostra a quantidade de vezes que o produto foi vendido
        produto1.quantidadeDeVendas();
        produto2.quantidadeDeVendas();


    }

}
