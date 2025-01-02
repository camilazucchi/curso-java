package fundamentos.exconceitosbasicos;

import javax.swing.*;

public class Exercicio1 {
    public static void main(String[] args) {
        // Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
        String input1 = JOptionPane.showInputDialog("Digite a temperatura em Fahrenheit: ");
        double tempF = Double.parseDouble(input1);

        double conversao = (tempF - 32) / 1.8;

        JOptionPane.showMessageDialog(null, String.format("A temperatura em Celsius é: %.2f°C", conversao));
    }
}
