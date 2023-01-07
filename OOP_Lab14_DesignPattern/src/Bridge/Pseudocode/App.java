package Bridge.Pseudocode;

public class App {
    public static void main(String[] args) {
        OperatingSystem windows = new WindowOS();
        OperatingSystem macOs = new MacOS();

        Computer laptop1 = new Laptop(windows);
        laptop1.startup();
        laptop1.browseInternet("designpatterns1.com");
        Computer laptop2 = new Laptop(macOs);
        laptop2.startup();
        laptop2.browseInternet("designpatterns2.com");

        Computer pc1 = new PC(macOs);
        pc1.startup();
        pc1.browseInternet("designpatterns3.com");
        Computer pc2 = new PC(windows);
        pc2.startup();
        pc2.browseInternet("designpatterns4.com");
    }
}
