package Iterator.Ex2;

public class App {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog(new String[]{"Chair", "Table", "Board"});
        for (Iterator iterator = productCatalog.getIterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }

    }
}
