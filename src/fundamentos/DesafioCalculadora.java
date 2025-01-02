package fundamentos;

import javax.swing.*;

public class DesafioCalculadora {
    public static void main(String[] args) {

        String input1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        double num1 = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Digite o segundo número: ");
        double num2 = Double.parseDouble(input2);

        String input3 = JOptionPane.showInputDialog("Escolha uma operação (+, -, *, / ou %): ");
        String op = input3;

        // Lógica
        // Utilizamos os operadores ternários, sem estruturas de controle
        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;

        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

    }
}
