import java.util.Calendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    private String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public boolean isLeapYear(int year) {
        boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (leapYear) {
            return true;
        }
        return false;
    }

    public int[] daysInMonth(int year) {

        int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year)) {
            DAYS_IN_MONTHS[1] = 29;
        }

        return DAYS_IN_MONTHS;
    }

    public boolean isValidDate(int year, int month, int day) {
        if (isLeapYear(year)) {
            if (month == 2) {
                if (day <= DAYS_IN_MONTHS[1] + 1) {
                    return true;
                } else return false;
            } else {
                if (day <= DAYS_IN_MONTHS[month - 1]) {
                    return true;
                }
                return false;
            }
        }

        if (day <= DAYS_IN_MONTHS[month - 1]) {
            return true;
        }
        return false;
    }

    public String getDayOfWeek(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DATE, day);

        return DAYS[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toString() {
        return DAYS + String.valueOf(day) + MONTHS[month - 1] + String.valueOf(year);
    }

    public MyDate nextYear() {
        int nextYear = this.getYear() + 1;

        return new MyDate(nextYear, this.getMonth(), this.getDay());
    }

    public MyDate nextMonth() {
        int nextMonth = this.getMonth() + 1;
        int nextYear = this.getYear();

        if (this.getMonth() == 11) {
            nextMonth = 0;
            nextYear = this.nextYear().getYear();
        }

        return new MyDate(nextYear, nextMonth, this.getDay());
    }

    public MyDate nextDay() {

        int[] days_max = daysInMonth(this.getYear());

        int nextDay = this.getDay() + 1;
        int nextMonth = this.getMonth();
        int nextYear = this.getYear();

        if (this.getDay() == days_max[this.getMonth() - 1]) {
            nextDay = 1;
            nextMonth = this.nextMonth().getMonth();
            nextYear = this.nextMonth().getYear();
        }

        return new MyDate(nextYear, nextMonth, nextDay);
    }

    public MyDate previousYear() {
        int prevYear = this.getYear() - 1;

        return new MyDate(prevYear, this.getMonth(), this.getDay());
    }

    public MyDate previousMonth() {
        int prevMonth = this.getMonth() - 1;
        int prevYear = this.getYear();

        if (this.getMonth() <= 1) {
            prevMonth = 12;
            prevYear = this.previousYear().getYear();
        }

        return new MyDate(prevYear, prevMonth, this.getDay());
    }

    public MyDate previousDay() {
        int[] days_max = daysInMonth(this.getYear());

        int prevDay = this.getDay() - 1;
        int prevMonth = this.getMonth();
        int prevYear = this.getYear();

        if (this.getDay() == 1) {
            prevMonth = this.previousMonth().getMonth(); //1 -> 12
            prevDay = days_max[prevMonth - 1]; //
            prevYear = this.previousMonth().getYear();
        }

        return new MyDate(prevYear, prevMonth, prevDay);
    }
}
