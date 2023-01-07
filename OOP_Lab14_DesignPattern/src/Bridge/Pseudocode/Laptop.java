package Bridge.Pseudocode;

public class Laptop extends Computer {

    public Laptop(OperatingSystem os) {
        super(os);
    }

    @Override
    public void startup() {
        this.os.startup();
    }

    @Override
    public void browseInternet(String url) {
        this.os.loadURL();
        System.out.println("Laptop browse " + url);
    }

    @Override
    public boolean canMove() {
        return true;
    }
}
