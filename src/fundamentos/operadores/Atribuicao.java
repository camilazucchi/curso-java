package fundamentos.operadores;

public class Atribuicao {
    public static void main(String[] args) {
        int a = 3;
        int b = a;
        int c = a + b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        c += b; // c = c + b;
        c -= a; // c = c - a;
        c *= b; // c = c * b;
        c /= a; // c = c / a;
        c %= 2; // c = c % 2;
        c++; // c = c + 1;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
