package Builder.Pseudocode;

public class Director {
    public void constructSportCar(Builder builder) {
        builder.reset().setSeats(2).setEngine("SportEngine").setTripComputer(true).setGPS(true);
    }

    public void constructSUV(Builder builder) {
        builder.reset().setSeats(5).setEngine("SUVEngine").setTripComputer(true).setGPS(true);
    }
}
