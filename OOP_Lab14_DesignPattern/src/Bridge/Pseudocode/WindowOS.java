package Bridge.Pseudocode;

public class WindowOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("WindowOS starting up!");
    }

    @Override
    public void loadURL() {
        System.out.println("WindowOS loading url!");
    }
}
