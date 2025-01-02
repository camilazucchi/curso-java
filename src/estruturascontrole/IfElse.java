package estruturascontrole;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {

        String value = JOptionPane.showInputDialog("Informe o número: ");
        int number = Integer.parseInt(value); // Utilizamos para converter uma String em um número inteiro

        // Verifica se o número é par
        if (number % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Número par!");
        } else {
            JOptionPane.showMessageDialog(null, "Número ímpar!");
        }

    }
}
