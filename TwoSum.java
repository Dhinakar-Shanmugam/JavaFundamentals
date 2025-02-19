public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2,7,5,7};
        int target = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
    }
}
