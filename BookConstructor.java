public class BookConstructor {
    String title;
    float price;
    BookConstructor(){
        title = "Java Programming";
        price = 100.0f;
    }
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
    }
    public static void main(String[] args) {
       BookConstructor book = new BookConstructor();
       book.display();
    }
}
