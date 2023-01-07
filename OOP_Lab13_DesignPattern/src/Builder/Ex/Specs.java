package Builder.Ex;

public class Specs {
    private String CPU;
    private int ram;
    private int rom;
    private boolean touchScreen;

    public Specs() {}

    public Specs(String CPU, int ram, int rom, boolean touchScreen) {
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
        return "Specs{" +
                "CPU='" + CPU + '\'' +
                ", ram=" + ram +
                "Gb, rom=" + rom +
                "Gb, touchScreen=" + touchScreen +
                '}';
    }
}
