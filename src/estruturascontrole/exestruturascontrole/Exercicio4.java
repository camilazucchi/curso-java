package estruturascontrole.exestruturascontrole;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        /* Exercício 4: Criar um programa que receba duas notas parciais e calcular a média final.
        * Se a nota do aluno for maior ou igual a 7,0, imprime no console "Aprovado", se a nota for menor
        * que 7,0 e maior do que 4,0, imprime no console "Recuperação", caso contrário, imprime no console
        * "Reprovado".*/

        Scanner input = new Scanner(System.in);

        // Recebe as duas notas:
        System.out.println("Insira a primeira nota: ");
        double num1 = input.nextDouble();
        System.out.println("Insira a segunda nota: ");
        double num2 = input.nextDouble();

        // Calcula a média final:
        double sum = num1 + num2;
        double media = sum / 2;

        // Faz as verificações:
        if (media >= 7.0) {
            System.out.printf("Média final: %.2f%n", media);
            System.out.println("Aprovado");
        } else if (media < 7.0 && media > 4.0) {
            System.out.printf("Média final: %.2f%n", media);
            System.out.println("Recuperação");
        } else {
            System.out.printf("Média final: %.2f%n", media);
            System.out.println("Reprovado");
        }


        input.close();

    }
}
