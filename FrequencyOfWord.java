import java.util.HashMap;

public class FrequencyOfWord {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        String str = "aabbbccc";
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
        }
        System.out.print(map);
    }
}
