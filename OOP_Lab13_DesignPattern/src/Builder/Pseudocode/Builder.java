package Builder.Pseudocode;

import javax.swing.plaf.ButtonUI;

public interface Builder {
    Builder reset();
    Builder setSeats(int number);
    Builder setEngine(String engine);
    Builder setTripComputer(boolean bool);
    Builder setGPS(boolean bool);
}
