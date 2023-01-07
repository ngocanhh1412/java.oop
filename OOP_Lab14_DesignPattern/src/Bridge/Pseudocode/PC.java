package Bridge.Pseudocode;

public class PC extends Computer {

    public PC(OperatingSystem os) {
        super(os);
    }

    @Override
    public void startup() {
        this.os.startup();
    }

    @Override
    public void browseInternet(String url) {
        this.os.loadURL();
        System.out.println("PC browse " + url);
    }

    @Override
    public boolean canMove() {
        return false;
    }
}
