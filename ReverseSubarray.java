import java.util.Arrays;

public class ReverseSubarray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        int n = arr.length;
        for (int i = 0; i < n; i+=k) {
            int start = i;
            int end = Math.min(i+k-1,n-1);
            while (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
