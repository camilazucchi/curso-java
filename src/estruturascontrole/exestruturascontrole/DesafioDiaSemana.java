package estruturascontrole.exestruturascontrole;

import javax.swing.*;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        // Começa por Domingo → 1

        String value = JOptionPane.showInputDialog("Digite o dia da semana: ");

        if (value.isBlank()) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um dia da semana válido (Domingo a Sábado)!");
        } else if (value.equalsIgnoreCase(DiasSemana.DOMINGO)) {
            JOptionPane.showMessageDialog(null, 1);
        } else if (value.equalsIgnoreCase(DiasSemana.SEGUNDA)) {
            JOptionPane.showMessageDialog(null, 2);
        } else if (value.equalsIgnoreCase(DiasSemana.TERCA)) {
            JOptionPane.showMessageDialog(null, 3);
        } else if (value.equalsIgnoreCase(DiasSemana.QUARTA)) {
            JOptionPane.showMessageDialog(null, 4);
        } else if (value.equalsIgnoreCase(DiasSemana.QUINTA)) {
            JOptionPane.showMessageDialog(null, 5);
        } else if (value.equalsIgnoreCase(DiasSemana.SEXTA)) {
            JOptionPane.showMessageDialog(null, 6);
        } else if (value.equalsIgnoreCase(DiasSemana.SABADO)) {
            JOptionPane.showMessageDialog(null, 7);
        } else {
            JOptionPane.showMessageDialog(null, "Dia inválido!");
        }

    }
}