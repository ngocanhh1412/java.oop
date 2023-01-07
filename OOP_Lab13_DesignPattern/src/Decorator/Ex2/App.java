package Decorator.Ex2;

public class App {
    public static void main(String[] args) {
        IceCream iceCream1 = new ChocolateIceCream();
        IceCream fullTopping = new HoneyToppingDecorator(new NutsToppingDecorator(iceCream1));

        System.out.println(fullTopping.getDescription());
    }
}
