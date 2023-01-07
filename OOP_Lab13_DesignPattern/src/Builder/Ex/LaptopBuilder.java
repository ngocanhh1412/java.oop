package Builder.Ex;

import Builder.Pseudocode.Car;

public class LaptopBuilder implements Builder {
    private Laptop laptop;

    @Override
    public Builder reset() {
        this.laptop = new Laptop();
        return this;
    }

    @Override
    public Builder setCPU(String CPU) {
        this.laptop.setCPU(CPU);
        return this;
    }

    @Override
    public Builder setRam(int ram) {
        this.laptop.setRam(ram);
        return this;
    }

    @Override
    public Builder setRom(int rom) {
        this.laptop.setRom(rom);
        return this;
    }

    @Override
    public Builder setTouchScreen(boolean bool) {
        this.laptop.setTouchScreen(bool);
        return this;
    }

    public Laptop getResult() {
        Laptop result = this.laptop;
        this.reset();
        return result;
    }
}
