package Visitor.Pseudocode;

public class DesignPatternBook extends ProgrammingBook {
    private String resource;
    private String bestSeller;

    public DesignPatternBook(double price, String resource, String bestSeller) {
        super(price);
        this.resource = resource;
        this.bestSeller = bestSeller;
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

    public String getBestSeller() {
        return bestSeller;
    }
}
