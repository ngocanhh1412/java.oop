package Builder.Ex;

public class App {
    public static void main(String[] args) {
        Director director = new Director();

        LaptopBuilder builder = new LaptopBuilder();
        director.produceMacBook(builder);
        Laptop mac = builder.getResult();
        System.out.println(mac);

        LaptopBuilder builder1 = new LaptopBuilder();
        director.produceDell(builder1);
        Laptop dell = builder1.getResult();
        System.out.println(dell);
    }

}