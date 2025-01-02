package estruturascontrole.exestruturascontrole;

import javax.swing.*;
import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.println("Por favor, informe a nota: ");
            nota = scanner.nextDouble();

            if (nota <= 10 && nota >= 0) {
                total += nota;
                quantidadeDeNotas++;
            }

        }

        // Calcular a média
        double media = total / quantidadeDeNotas;
        System.out.printf("Média: %s%n", media);

        scanner.close();

    }

}
