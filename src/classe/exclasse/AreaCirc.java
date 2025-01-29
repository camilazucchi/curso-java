package classe.exclasse;

public class AreaCirc {

    double raio;
    // Constante:
    // 'static' quer dizer que o valor pertence à classe e não à instância
    static final double PI = 3.14;

    public AreaCirc(double raio) {
        this.raio = raio;
    }

    double area() {
        return PI * Math.pow(raio, 2);
    }

}