public class TwoSumPossibilities {
    public static void main(String[] args) {
        int arr[] = {2,7,5,1,2};
        int target = 4;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                   count++;
                }
            }
        }
        System.out.println(count);
    }
}
