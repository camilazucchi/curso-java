package estruturascontrole;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        // Será executada pelo menos uma vez
        // A diferença entre While e Do While é a execução do bloco

        Scanner input = new Scanner(System.in);

        String text = "";

        do {
            System.out.println("Você precisa falar as palavras mágicas...");
            System.out.println("Quer sair?");
            text = input.nextLine();
        } while (!text.equalsIgnoreCase("Por favor"));

        System.out.println("Obrigada!");
        input.close();

    }
}
