package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá mundo"); //charAt(n)

        String s = "Boa tarde";
        System.out.println(s.concat("!!!!"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        // A String é um objeto imutável, ou seja, não podemos mudar o valor inicial atribuído a ela.

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 1300.00;

        System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome);

        System.out.printf("Nome: %s", nome);
        System.out.println(); // Nova linha
        System.out.printf("O senhor %s %s tem %d", nome, sobrenome, idade);
    }
}
