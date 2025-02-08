package calss1.construct;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("홍길동","최동진");
        book2.displayInfo();

        Book book3 = new Book("별주부전","김장두", 200);
        book3.displayInfo();

    }
}
