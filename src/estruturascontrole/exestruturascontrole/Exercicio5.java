package estruturascontrole.exestruturascontrole;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        /* Exercício 5: Criar um programa que receba um número e diga se ele é um número primo*/

        int contadorDeDivisores = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, insira um número: ");
        int num = input.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                contadorDeDivisores++;
            }
        }

        if (contadorDeDivisores == 0) {
            System.out.printf("O número %d é primo! :)", num);
        } else {
            System.out.printf("O número %d não é primo! :(", num);
        }

        input.close();

    }
}
