import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int arr[] = {1,0,4,5,0,0,3,0,7};
        ArrayList<Integer> list = new ArrayList<>();
        int i;
        for ( i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                list.add(arr[i]);
            }
        }
        for (i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        for (i = list.size(); i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));

    }
}
