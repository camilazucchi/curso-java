package classe.exclasse;

public class DataTeste {
    public static void main(String[] args) {

        // Instanciar duas datas

        Data data1 = new Data();

        Data data2 = new Data(10, 11, 1997);

        System.out.println(data1.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());
    }
}
