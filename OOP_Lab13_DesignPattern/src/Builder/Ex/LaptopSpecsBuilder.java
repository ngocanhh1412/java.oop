package Builder.Ex;

public class LaptopSpecsBuilder implements Builder {
    private Specs specs;

    @Override
    public Builder reset() {
        this.specs = new Specs();
        return this;
    }

    @Override
    public Builder setCPU(String CPU) {
        this.specs.setCPU(CPU);
        return this;
    }

    @Override
    public Builder setRam(int ram) {
        this.specs.setRam(ram);
        return this;
    }

    @Override
    public Builder setRom(int rom) {
        this.specs.setRom(rom);
        return this;
    }

    @Override
    public Builder setTouchScreen(boolean bool) {
        this.specs.setTouchScreen(bool);
        return this;
    }

    public Specs getResult() {
        return this.specs;
    }
}
