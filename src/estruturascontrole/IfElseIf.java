package estruturascontrole;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        double grade = input.nextDouble();

        if (grade > 10 || grade < 0) {
            System.out.println("Nota inválida!");
        } else if (grade >= 8.1) {
            System.out.println("Conceito A");
        } else if (grade >= 6.1) {
            System.out.println("Conceito B");
        } else if (grade >= 4.1) {
            System.out.println("Conceito C");
        } else if (grade >= 2.1) {
            System.out.println("Conceito D");
        } else {
            System.out.println("Conceito E");
        }

        input.close();

    }
}
