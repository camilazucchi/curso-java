package estruturascontrole.exestruturascontrole;

import java.util.Scanner;

public class DesafioWhile3 {
    public static void main(String[] args) {

        // Soma de números positivos

        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int sum = 0;

        while (num % 2 == 0) {
            System.out.println("Digite um número positivo: ");
            num = scanner.nextInt();
            sum += num; // Soma os números
            System.out.printf("Soma dos números: %d%n", sum);
        }

        System.out.println("Você digitou um número negativo. Finalizando programa...");

        scanner.close();

    }
}
