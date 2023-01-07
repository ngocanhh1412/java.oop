package Bridge.Pseudocode;

public class MacOS implements OperatingSystem {
    @Override
    public void startup() {
        System.out.println("MacOS starting up!");
    }

    @Override
    public void loadURL() {
        System.out.println("MacOS loading url!");
    }
}
