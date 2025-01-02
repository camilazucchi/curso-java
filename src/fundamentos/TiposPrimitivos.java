package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionário

        // Tipos numéricos inteiros
        // Valores literais: direto no código
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;

        // Tipos numéricos reais (com ponto flutuante)
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = true;

        // Tipo caractere
        char status = 'A'; // Ativo

        // Dias de empresa
        System.out.println("Dias de empresa: " + anosDeEmpresa * 365);

        // Número de viagens
        System.out.println("Número de viagens: " + numeroDeVoos / 2);

        // Pontos por real
        System.out.println("Pontos: " + Math.round(pontosAcumulados / vendasAcumuladas));

        // Id
        System.out.println("ID: " + id);

        // Salário
        System.out.println("Salário: " + salario);

        // Férias
        System.out.println("O funcionário está de férias? " + estaDeFerias);

        // Ativo
        System.out.println("O funcionário está ativo? " + status);

    }
}
