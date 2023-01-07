package Builder.Ex;

public class Laptop {
    private String CPU;
    private int ram;
    private int rom;
    private boolean touchScreen;

    public Laptop() {}

    public Laptop(String CPU, int ram, int rom, boolean touchScreen) {
        this.CPU = CPU;
        this.ram = ram;
        this.rom = rom;
        this.touchScreen = touchScreen;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "CPU='" + CPU + '\'' +
                ", ram=" + ram +
                ", rom=" + rom +
                ", touchScreen=" + touchScreen +
                '}';
    }
}
