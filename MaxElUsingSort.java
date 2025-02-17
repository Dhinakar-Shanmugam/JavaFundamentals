import java.util.Arrays;

public class MaxElUsingSort {
    public static void main(String[] args) {
        int arr[] = {6,3,4,8,2,4,9};
        Arrays.sort(arr);
        System.out.println("First Maximum element: "+arr[arr.length-1]);
        System.out.println("Second Maximum element: "+arr[arr.length-2]);
        System.out.println("Third Maximum element: "+arr[arr.length-3]);
    }
}
