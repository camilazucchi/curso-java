package estruturascontrole;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        // Quantidade INDETERMINADA de repetições

        Scanner input = new Scanner(System.in);

        String value = "";

        while (!value.equalsIgnoreCase("Sair")) {
            System.out.println("Você diz: ");
            value = input.nextLine();
        }

        input.close();


    }
}
