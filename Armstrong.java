import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = scan.nextInt();
        int oddSum = 0;
        while(num > 0){
            int last = num % 10;
            if(last % 2 != 0){
                oddSum = oddSum * 10 + last;
            }
            num /= 10;
        }

        System.out.println("OddSum: "+oddSum);

        int armNum = 0;
        int original = oddSum;
        int digit = (int) Math.log10(oddSum);
        while (oddSum > 0){
            int rem = oddSum % 10;
            armNum = armNum + (int)Math.pow(rem,digit);
            oddSum /= 10;
        }
        if (armNum == original ){
            System.out.println("It is an Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
