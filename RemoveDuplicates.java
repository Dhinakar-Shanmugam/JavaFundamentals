import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {3,2,3,1,2,9};
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        int i;
        for (i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for(i = 0; i < arr.length;i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i]+ " : " +count);
            count = 0;
        }
        System.out.println(set);
    }
}
