public class ShortCircuitOperator {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        if(a > b & a > c){  // & - check both condition
            System.out.println(a + " is greater");
        }
        else if(b > c){
            System.out.println(b + " is greater");
        }
        else{
            System.out.println(c + " is greater");
        }
    }
}
