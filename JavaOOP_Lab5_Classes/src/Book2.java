public class Book2 {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book2() {
        qty = 0;
    }

    public Book2 (String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        qty = 1;
    }

    public Book2 (String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
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

    public String toString() {
        return "Book[name=" + name + ",author={" + authors[0].toString() + "," + authors[1].toString() + "},price=" + price + ",qty=" + qty + "]";
    }

}