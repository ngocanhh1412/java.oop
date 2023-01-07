package Visitor.Pseudocode;

public class JavaCoreBook extends ProgrammingBook {
    private String resource;
    private String favourite;

    public JavaCoreBook(double price, String resource, String favourite) {
        super(price);
        this.resource = resource;
        this.favourite = favourite;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public String getResource() {
        return resource;
    }

    public String getFavouriteBook() {
        return favourite;
    }
}
