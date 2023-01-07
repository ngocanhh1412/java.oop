package Builder.Ex;

public interface Builder {
    Builder reset();
    Builder setCPU(String CPU);
    Builder setRam(int ram);
    Builder setRom(int rom);
    Builder setTouchScreen(boolean bool);
}