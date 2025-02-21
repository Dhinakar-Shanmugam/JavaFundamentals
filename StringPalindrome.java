public class StringPalindrome {
    public static void main(String[] args) {
        String str = "racecars";
        String original = str;
        int start = 0;
        int end = str.length()-1;
        String revStr = "";
        while (start <= end){
            revStr = revStr + str.charAt(end);
            end--;
        }
        if(revStr.equals(original)){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
