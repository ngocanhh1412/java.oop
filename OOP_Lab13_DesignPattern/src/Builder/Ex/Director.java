package Builder.Ex;

public class Director {
    public void produceMacBook(Builder builder) {
        builder.reset().setCPU("Apple M1").setRam(8).setRom(256).setTouchScreen(false);
    }

    public void produceDell(Builder builder) {
        builder.reset().setCPU("Intel Core i9").setRam(16).setRom(512).setTouchScreen(true);
    }
}
