import java.util.Scanner;

public class CountEvenOddInDidit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        int countEven = 0;
        int countOdd = 0;
        while (num > 0){
            int last = num % 10;
            if(last % 2 == 0){
                countEven += last;
            }
            else{
                countOdd += last;
            }
            num /= 10;
        }
        System.out.println("Even Count: "+countEven);
        System.out.println("Odd Count: "+countOdd);
    }
}
