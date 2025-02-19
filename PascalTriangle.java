import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 1;
        int res = 0;
        System.out.print("Enter the height of Pascal's Triangle: ");
        int n = scan.nextInt();
        System.out.print("Enter the row and the value will be returned: ");
        int find = scan.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            count = count * (x*10+x);
            System.out.print(count);
            System.out.println();
            if(find == i){
                res = count;
            }
        }
        System.out.println("The Output is: "+res);
    }
}
