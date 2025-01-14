package estruturascontrole.exestruturascontrole;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main() {

        /* Exercício 6: Jogo da adivinhação:
        * Tentar adivinhar um número entre 0 - 100. Armazene um número aleatório em uma variável.
        * O jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa,
        * imprima a quantidade de tentativas restantes, e imprima se o número inserido é maior
        * ou menor do que o número armazenado. */

        Random randomNumGen = new Random();
        int num = randomNumGen.nextInt(101);
        int maxAttempts = 10;
        System.out.printf("Cheatzinho: %d%n", num);
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= maxAttempts; i++) {
            System.out.printf("Tentativa #%d de #%d%n", i, maxAttempts);
            System.out.println("Qual é o número sorteado (entre 0 e 100)?");

            int guess = input.nextInt();

            if (guess < 0 || guess > 100) {
                System.out.println("Por favor, insira um número ente 0 e 100.");
                i--;
                continue;
            }

            if (guess == num) {
                System.out.println("Parabéns! Você acertou! :D");
                break;
            } else if (guess < num) {
                System.out.println("O número é maior que o seu palpite! :(\n");
            } else {
                System.out.println("O número é menor que o seu palpite! :(\n");
            }

            int maxAttemptsLeft = maxAttempts - i;
            if (maxAttemptsLeft > 0) {
                System.out.printf("Você ainda tem %d tentativa(s).\n", maxAttemptsLeft);
            }

        }

        input.close();

    }
}
