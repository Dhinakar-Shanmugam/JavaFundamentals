public class MaxElementInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int max = arr[0];
        int secMax = arr[0];
        int thirdMax = arr[0];
        int i;
        for (i = 1;  i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("First Maximum element: "+max);
        for (i = 1;  i < arr.length; i++) {
            if(arr[i] > secMax && arr[i] != max){
                secMax = arr[i];
            }
        }
        System.out.println("Second Maximum element: "+secMax);
        for (i = 1;  i < arr.length; i++) {
            if(arr[i] > thirdMax && arr[i] != max && arr[i] != secMax){
                thirdMax = arr[i];
            }
        }
        System.out.println("Third Maximum element: "+thirdMax);
    }
}
