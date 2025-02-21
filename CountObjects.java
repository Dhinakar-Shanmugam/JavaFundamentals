public class CountObjects {
    static int count = 0;
    CountObjects(){
        count = count + 1;
        System.out.println("Object Created! Current count = "+count);
    }

    public static void main(String[] args) {
        CountObjects obj1 = new CountObjects();
        CountObjects obj2 = new CountObjects();
        CountObjects obj3 = new CountObjects();
    }
}
