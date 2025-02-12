public class Arithmetic {
    public static void main(String[] args) {
        byte a = 1;
        byte b = 1;

        byte add,sub,mul,div,mod;

        add = (byte) (a + b);
        sub = (byte) (a - b);
        mul = (byte) (a * b);
        div = (byte) (a / b);
        mod = (byte) (a % b);

        System.out.println("Add:" + add);
        System.out.println("Subtract:" + sub);
        System.out.println("Multiplication:" + mul);
        System.out.println("Division:" + div);
        System.out.println("Modulo:" + mod);

    }
}
