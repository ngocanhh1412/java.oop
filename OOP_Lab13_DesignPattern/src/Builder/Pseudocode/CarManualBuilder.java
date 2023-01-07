package Builder.Pseudocode;

public class CarManualBuilder implements Builder {
    private Manual manual;

    @Override
    public Builder reset() {
        this.manual = new Manual();
        return this;
    }

    @Override
    public Builder setSeats(int number) {
        this.manual.setSeats(number);
        return this;
    }

    @Override
    public Builder setEngine(String engine) {
        this.manual.setEngine(engine);
        return this;
    }

    @Override
    public Builder setTripComputer(boolean bool) {
        this.manual.setTripComputer(bool);
        return this;
    }

    @Override
    public Builder setGPS(boolean bool) {
        this.manual.setGPS(bool);
        return this;
    }

    public Manual getResult() {
        return this.manual;
    }
}
