package estruturascontrole;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a média: ");
        double media = scanner.nextDouble();

        if (media >= 7.0) {
            System.out.println("Aprovado");
            System.out.println("Parabéns!");
        }

        scanner.close();

    }
}
