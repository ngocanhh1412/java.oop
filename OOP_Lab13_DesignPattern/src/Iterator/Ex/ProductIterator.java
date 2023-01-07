package Iterator.Ex;

public class ProductIterator implements Iterator{
    private String[] productCatalog;
    private int length;
    private  int currentPosition;

    public ProductIterator(String[] productCatalog, int length) {
        this.productCatalog = productCatalog;
        this.length = length;
    }

    @Override
    public boolean hasNext() {
        return ((currentPosition <= this.productCatalog.length - 1) && (currentPosition <= length -1));
    }

    @Override
    public Object next() {
//        String currentProduct = this.productCatalog[currentPosition];
//        currentPosition++;
//        return currentProduct;
        return this.productCatalog[currentPosition++];
    }
}
