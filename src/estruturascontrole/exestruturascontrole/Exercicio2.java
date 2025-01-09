package estruturascontrole.exestruturascontrole;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        /* Exercício 2: Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par */

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int num = input.nextInt();

        if (num >= 0 && num <= 10) {
            if (num % 2 == 0) {
                System.out.printf("O número %d está entre 0 e 10 e é par!%n", num);
            } else {
                System.out.printf("O número %d está entre 0 e 10, mas não é par.%n", num);
            }
            } else {
            System.out.printf("O número %d não está entre 0 e 10!%n", num);
        }

        input.close();

    }
}
