package Visitor.Pseudocode;

public class ConcreteVisitor implements Visitor {
    private double totalPrice;
    @Override
    public void visit(BusinessBook book) {
        this.totalPrice += book.getPrice();
        System.out.println(book.getPublisher());
    }

    @Override
    public void visit(DesignPatternBook book) {
        this.totalPrice += book.getPrice();
        System.out.println(book.getResource());
        System.out.println(book.getBestSeller());
    }

    @Override
    public void visit(JavaCoreBook book) {
        this.totalPrice += book.getPrice();
        System.out.println(book.getResource());
        System.out.println(book.getFavouriteBook());
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
