public class Ternary {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = (a > b && a > c) ? a : (b > c) ? b : c;
        System.out.println("The Greatest Number is "+ d);
    }
}
