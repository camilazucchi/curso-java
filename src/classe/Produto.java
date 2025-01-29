package classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    // Construtor padrão de forma explícita
    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

}