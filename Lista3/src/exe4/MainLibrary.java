package exe4;

public class MainLibrary {
    public static void main(String[] args) {
        Book book1 = new Book("Java", "Deitel", 2015, 123);
        Book book2 = new Book("Python", "Casas", 2019, 456);
        Book book3 = new Book("React", "Casa do Código", 2023, 789);

        LibraryUser lu1 = new LibraryUser(1, "Marcos");
        lu1.addLoanItem(11, 7, book1);
        lu1.addLoanItem(12, 8, book2);
        lu1.addLoanItem(13, 10, book3);
        System.out.println(lu1.toString());
        lu1.removeLoanItem(12);
        System.out.println(lu1.toString());
    }
}