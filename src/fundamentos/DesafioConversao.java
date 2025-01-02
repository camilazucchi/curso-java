package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("- Desafio: Conversão -");
        System.out.println("Digite o primeiro salário do funcionário: ");
        String str1 = scanner.nextLine().replace(",", ".");
        System.out.println("Digite o segundo salário do funcionário: ");
        String str2 = scanner.nextLine().replace(",", ".");
        System.out.println("Digite o terceiro salário do funcionário: ");
        String str3 = scanner.nextLine().replace(",", ".");

        // Conversões:
        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);
        double num3 = Double.parseDouble(str3);

        double sum = num1 + num2 + num3;
        double total = sum / 3.0;

        System.out.printf("O salário final é: %.3f", total);

        scanner.close();

    }
}
