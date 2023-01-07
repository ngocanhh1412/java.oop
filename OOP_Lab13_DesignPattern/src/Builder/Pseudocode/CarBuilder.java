package Builder.Pseudocode;

public class CarBuilder implements Builder {
    private Car car;

    @Override
    public Builder reset() {
        this.car = new Car();
        return this;
    }

    @Override
    public Builder setSeats(int number) {
        this.car.setSeats(number);
        return this;
    }

    @Override
    public Builder setEngine(String engine) {
        this.car.setEngine(engine);
        return this;
    }

    @Override
    public Builder setTripComputer(boolean bool) {
        this.car.setTripComputer(bool);
        return this;
    }

    @Override
    public Builder setGPS(boolean bool) {
        this.car.setGPS(bool);
        return this;
    }

    public Car getResult() {
        Car result = this.car;
        this.reset();
        return result;
    }
}
