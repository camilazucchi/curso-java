package fundamentos.exconceitosbasicos;

import javax.swing.*;

public class Exercicio2 {
    public static void main(String[] args) {
        // Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
        String input1 = JOptionPane.showInputDialog("Digite a temperatura em Celsius: ");
        double tempC = Double.parseDouble(input1);

        double conversao = (tempC * 1.8) + 32;

        JOptionPane.showMessageDialog(null, String.format("A temperatura em Fahreinheit é: %.2f°C", conversao));
    }
}
