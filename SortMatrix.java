import java.util.Scanner;

public class SortMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int n = scan.nextInt();
        int arr[][] = new int[n][n];
        int a[] = new int[n*n];
        int i,j;
        System.out.print("Enter the values for matrix: ");
        for (i = 0; i < arr.length; i++) {    //Getting Values for matrix
            for (j = 0; j < arr.length; j++) {   
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("Before Sorting: ");
        for (i = 0; i < arr.length; i++) {   //Print Values Before Sorting
            for ( j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int index = 0;
        for (i = 0; i < arr.length; i++) {    //Add the matrix values in 1D array
            for (j = 0; j < arr.length; j++) {
                a[index++] = arr[i][j];
            }
        }

        for (i = 0; i < a.length; i++) {   //Bubble Sort
            for (j = i+1; j < a.length; j++) {
               if(a[i] > a[j]){
                   int temp = a[i];
                   a[i] = a[j];
                   a[j] = temp;
               }
            }
        }

        index = 0;
        for (i = 0; i < arr.length; i++) {    //Add Sorted values to 2D Matrix
            for (j = 0; j < arr.length; j++) {
                arr[i][j] = a[index++];
            }
        }

        System.out.println("After Sorting: ");
        for (i = 0; i < arr.length; i++) {    //Print Matrix
            for ( j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
