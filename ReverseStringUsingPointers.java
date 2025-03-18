public class ReverseStringUsingPointers {
    public static void main(String[] args) {
        String str = "dhinakar";
        StringBuilder res = new StringBuilder();
        int start = 0;
        int end = str.length()-1;
        while(start <= end){
            res.append(str.charAt(end));
            end--;
        }
        System.out.println(res);
    }
}
