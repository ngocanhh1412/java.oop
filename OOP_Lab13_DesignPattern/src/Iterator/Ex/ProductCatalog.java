package Iterator.Ex;

public class ProductCatalog implements Iterable{
    private String[] productCatalog;
    private final int size = 100;
    int length;

    public ProductCatalog() {
        this.length = -1;
        productCatalog = new String[this.size];
    }

    public Iterator getIterator() {
        return new ProductIterator(this.productCatalog, this.length);
    }

    public ProductCatalog add(String product) {
        if (length >= this.productCatalog.length - 1) {
            return this;
        }

        this.productCatalog[this.length + 1] = product;
        this.length++;
        return this;
    }
}
