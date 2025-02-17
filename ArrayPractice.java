import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.print("Enter the values of array upto n: ");
        for (i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Forward: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Backward: ");
        for (i = n-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Foreach: ");
        for(int val : arr){
            System.out.print(val+ " ");
        }
    }
}
