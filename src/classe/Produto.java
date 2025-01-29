package classe;

public class Produto {

    String nome;
    double preco;
    // Desafio: Substituir o atributo 'desconto' para que seja estático
    static double desconto = 0.25;

    // Construtor padrão de forma explícita
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

}