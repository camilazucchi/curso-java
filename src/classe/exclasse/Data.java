package classe.exclasse;

public class Data {

    // Desafio 1: Criar classe Data com três atributos: dia, mês e ano
    int dia;
    int mes;
    int ano;

    // Desafio 3: Criar construtor padrão sem parâmetros, mas com valores definidos
    public Data() {
        // Dados inseridos quando não se passa nenhum dado ao instanciar um objeto Data
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    // Desafio 4: Criar construtor com parâmetros dia, mês e ano
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Desafio 2: Criar o método 'obterDataFormatada'
    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia, mes, ano);
    }

}
