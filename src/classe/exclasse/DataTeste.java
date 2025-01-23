package classe.exclasse;

public class DataTeste {
    public static void main(String[] args) {

        // Instanciar duas datas

        Data data1 = new Data();
        data1.dia = 01;
        data1.mes = 10;
        data1.ano = 1933;

        Data data2 = new Data();
        data2.dia = 10;
        data2.mes = 11;
        data2.ano = 1997;

        System.out.printf("Data 1\nDia: %d\nMês: %d\nAno: %d\n", data1.dia, data1.mes, data1.ano);
        System.out.printf("\nData 2\nDia: %d\nMês: %d\nAno: %d\n", data2.dia, data2.mes, data2.ano);

    }
}
