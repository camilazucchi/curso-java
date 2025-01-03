package estruturascontrole.exestruturascontrole;

public class DesafioFor {
    public static void main(String[] args) {

        String value = "#";

        System.out.println("- Resolução com valores numéricos -");
        for (int i = 1; i <= 5; i++) {
            System.out.println(value);
            value+= "#";
        }

        // Versão do desafio:
        // Não pode usar valor numérico para controlar o laço!
        System.out.println("\n- Resolução sem valores numéricos -");

        /* A variável 'i' começa com uma única hashtag, o loop continua
        * enquanto i não for igual a 6 hashtags.
        * A cada iteração, uma nova hashtag é adicionada à variável 'i'*/
        for (String i = "#"; !i.equals("######"); i += "#") {
            System.out.println(i);
        }

    }
}
