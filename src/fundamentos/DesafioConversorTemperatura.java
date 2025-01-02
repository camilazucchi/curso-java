package fundamentos;

import java.util.Scanner;

public class DesafioConversorTemperatura {
    public static void main(String[] args) {
        // Fórmula: (ºF - 32) x 5/9 = ºC
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        final int AJUSTE = 32;
        final double FATOR = 5.0 / 9.0;
        double celsius = Math.round((fahrenheit - AJUSTE) * FATOR);
        System.out.println("A temperatura " + fahrenheit + "ºF em Celsius é: " + celsius + "ºC.");

        scanner.close();
    }
}
