import java.util.Arrays;
import java.util.Scanner;

public class GettingInputArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int intArr[] = new int[3];
        double doubleArray[] = new double[3];
        String strArray[] = new String[3];
        char charArray[] = new char[3];
        System.out.print("Enter Integer Values: ");
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = scan.nextInt();
        }
        System.out.print(Arrays.toString(intArr));
        System.out.println();

        System.out.print("Enter Double Values: ");
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = scan.nextDouble();
        }
        System.out.print(Arrays.toString(doubleArray));
        System.out.println();

        System.out.print("Enter String Values: ");
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = scan.nextLine();
        }
        System.out.print(Arrays.toString(strArray));
        System.out.println();

        System.out.print("Enter Character Values: ");
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = scan.next().charAt(0);
        }
        System.out.print(Arrays.toString(charArray));
        System.out.println();



    }
}
