package Iterator.Ex;

public class App {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        productCatalog.add("Banana").add("Orange").add("Coconut").add("Grape");
        Iterator iterator = productCatalog.getIterator();


    }
}
