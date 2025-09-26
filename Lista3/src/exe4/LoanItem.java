package exe4;

public class LoanItem {
    private int id;
    private int days;
    private Book book;

    public LoanItem() {
    }
    // agregação
    public LoanItem(int id, int days, Book book) {
        this.id = id;
        this.days = days;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Book getBook() {
        return book;
    }
    // agregação
    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "\nLoanItem{" +
                "id=" + id +
                ", days=" + days +
                ", book=" + book +
                '}';
    }
}