public class TestDate {
    public static void main(String[] args) {
        MyDate birthday = new MyDate(2003,12,14);
        MyDate date1 = new MyDate(2022, 10,25);
        System.out.println(date1);
        System.out.println(birthday);

        System.out.println(birthday.previousDay());
        System.out.println(birthday.previousMonth());
        System.out.println(birthday.previousYear());

        System.out.println(date1);
        System.out.println(date1.nextDay());

    }
}
