public class Book3 {
    private String isbn;
    private String name;
    private Author3 author;
    private double price;
    private int qty = 0;

    public Book3 (String isbn, String name, Author3 author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        qty = 1;
    }

    public Book3 (String isbn, String name, Author3 author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author3 getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName() {
        return author.getName();
    }

    public String toString() {
        return "Book[name=" + name + ",author=" + author + ",price=" + String.valueOf(price) + ",qty=" + String.valueOf(qty) + "]";
    }
}