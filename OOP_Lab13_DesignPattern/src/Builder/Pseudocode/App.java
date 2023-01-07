package Builder.Pseudocode;

public class App {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportCar(builder);
        Car car = builder.getResult();
        System.out.println(car);

        CarManualBuilder builder1 = new CarManualBuilder();
        director.constructSportCar(builder1);
        Manual manual = builder1.getResult();
        System.out.println(manual);
    }

}
