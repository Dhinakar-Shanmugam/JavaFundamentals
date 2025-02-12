import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = scan.nextInt();
        int count = 0;
        for (int i = 1; i <= n ; i++) {
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("It is Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}
