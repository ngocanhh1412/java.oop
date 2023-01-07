package Builder.Pseudocode;

public class Car {
    private boolean GPS;
    private boolean tripComputer;
    private int seats;
    private String engine;

    public Car() {}

    public Car (boolean GPS, boolean tripComputer, int seats, String engine) {
        this.GPS = GPS;
        this.tripComputer = tripComputer;
        this.seats = seats;
        this.engine = engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "GPS=" + GPS +
                ", tripComputer=" + tripComputer +
                ", seats=" + seats +
                ", engine='" + engine + '\'' +
                '}';
    }
}
