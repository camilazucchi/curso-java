package classe;

// Classe para testar a classe Produto
public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4356.89, 0.25);
        Produto p2 = new Produto("Caneta Azul", 12.56, 0.29);

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        // Refatoração utilizando o método 'precoComDesconto':
        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média do carrinho = R$%.2f", mediaCarrinho);
        System.out.println();

    }
}
