public class TestTime {
    public static void main(String[] args) {
        MyTime time1 = new MyTime(19,00,01);
        System.out.println(time1);

        System.out.println(time1.nextSecond().nextSecond());

        time1.setTime(0,0,0);
        System.out.println(time1);
        System.out.println(time1.previousSecond());
        System.out.println(time1.previousMinute());
        System.out.println(time1.previousHour());
    }
}