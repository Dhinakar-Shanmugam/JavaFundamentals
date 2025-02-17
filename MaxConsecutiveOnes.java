public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,0,0,1,0,1,1,1,0};
        int maxi = 0;
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == 1){
                count++;
                maxi = Math.max(maxi,count);
            }
            else if(arr[i] == 0){
                count = 0;
            }
        }
        System.out.println("Max Consecutive Ones: "+ maxi);
    }
}
