package Visitor.Pseudocode;

public abstract class ProgrammingBook extends Book {
    public ProgrammingBook(double price) {
        super(price);
    }

    public abstract String getResource();
}
