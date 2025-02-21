public class BookParameterizedConstructor {
    String title;
    String author;
    int price;
    BookParameterizedConstructor(String title,String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void  display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }

    public static void main(String[] args) {
        BookParameterizedConstructor obj = new BookParameterizedConstructor(
                "Who Moved My Cheese?",
                "Spencer Jhonson",
                200
        );
        obj.display();
    }
}
