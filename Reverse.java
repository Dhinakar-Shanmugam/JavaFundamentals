public class Reverse {
    public static void main(String[] args) {
        int n = 143;
        int rev = 0;
        while(n > 0){
            int last = n % 10;
            rev = rev * 10 + last;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
