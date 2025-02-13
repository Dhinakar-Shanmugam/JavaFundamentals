import java.util.Scanner;

public class PrintOddEvenPrimeInDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int evenNum = 0;
        int oddNum = 0;
        int count = 0;
        int original = num;
        int primeNum = 0;
        while (num > 0){
            int last = num % 10;
            if(last % 2 == 0){
                evenNum = evenNum * 10 + last;
            }
            else {
                oddNum = oddNum * 10 + last;
            }
            num /= 10;
        }
        System.out.println("EvenNum :" + evenNum);
        System.out.println("OddNum :" + oddNum);

        while(original > 0){
            int rem = original % 10;
            for (int i = 1; i <= rem ; i++) {
                if(rem % i == 0){
                    count++;
                }
            }
            if(count == 2){
                primeNum = primeNum * 10 + rem;
            }
            count = 0;
            original /= 10;
        }
        System.out.println("PrimeNum: "+ primeNum);
    }
}
