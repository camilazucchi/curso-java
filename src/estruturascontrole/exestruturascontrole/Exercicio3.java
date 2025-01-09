package estruturascontrole.exestruturascontrole;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        /* Exercício 3: Criar um programa que informa se o ano atual é um ano bissexto */

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o ano: ");
        int year = input.nextInt();

        // Anos divisíveis por 400 também são bissextos.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.printf("O ano %d é bissexto.", year);
        } else {
            System.out.printf("O ano %d não é bissexto.", year);
        }

        input.close();

    }
}
