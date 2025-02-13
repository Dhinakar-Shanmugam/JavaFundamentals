import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= n-i; sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                if(i == 1 || j == 1 || j == 2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        int num = n-1;
        for (int i = num; i >= 1; i--) {
            for (int sp = 1; sp <= n-i; sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                if(j == 1 || j == 2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
