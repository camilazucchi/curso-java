package fundamentos.operadores;

import java.util.Scanner;

public class DesafioOperadoresLogicos {
    public static void main(String[] args) {

        // Se os dois trabalhos derem certo: TV de 50 polegadas
        // Se apenas um dos dois trabalhos derem certo: TV de 32 polegadas
        // Ou comprando a TV de 50, ou a TV de 32 a família vai tomar sorvete
        // Não comprando nenhuma, sem sorvete

        Scanner scanner = new Scanner(System.in);

        System.out.println("O trabalho de terça deu certo? (True or false)");
        boolean trabalho1 = scanner.nextBoolean();
        System.out.println("O trabalho de quinta deu certo? (True or false)");
        boolean trabalho2 = scanner.nextBoolean();

        // Condições para as compras
        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        // Operador XOR: retorna verdadeiro apenas se uma das condições for verdadeira, mas não ambas
        boolean tomouSorvete = comprouTv50 || comprouTv32;
        
        if (comprouTv50) {
            System.out.println("Comprou a TV de 50 polegadas! :D");
        } else if (comprouTv32) {
            System.out.println("Comprou a TV de 32 polegadas! :D");
        } else {
            System.out.println("Não comprou nenhuma televisão. :(");
        }

        System.out.println("A família tomou sorvete? " + tomouSorvete);

        scanner.close();

    }
}
