package fundamentos;

public class OperadoresUnarios {
    public static void main(String[] args) {
        boolean x = false;
        System.out.println(x); // false
        x = !x;
        System.out.println(x); // true

        double y = 1.21;
        System.out.println(y); // 1.21
        y = -y;
        System.out.println(y); // - 1.21
        y = -y;
        System.out.println(y); // 1.21

        int counter = 0;
        System.out.println(counter); // 0
        System.out.println(++counter); // 1
        System.out.println(counter); // 1
        System.out.println(counter--); // 1
        System.out.println(counter); // 0
    }
}
