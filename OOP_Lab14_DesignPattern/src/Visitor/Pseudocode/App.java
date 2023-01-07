package Visitor.Pseudocode;

public class App {
    public static void main(String[] args) {
        ConcreteVisitor visitor = new ConcreteVisitor();

        Book businessbook1 = new BusinessBook(50, "DHQG");
        businessbook1.accept(visitor);

        Book designpatternbook1 = new DesignPatternBook(70, "Store", "NgocAnh");
        designpatternbook1.accept(visitor);

        Book javacorebook1 = new JavaCoreBook(60, "Store", "Google");
        javacorebook1.accept(visitor);

        System.out.println("Price of all books: " + visitor.getTotalPrice());
    }
}
