public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        String hourInWord = String.valueOf(hour);
        String minuteInWord = String.valueOf(minute);
        String secondInWord = String.valueOf(second);
        if (hour < 10) {
            hourInWord = "0" + String.valueOf(hour);
        }
        if (minute < 10) {
            minuteInWord = "0" + String.valueOf(minute);
        }
        if (second < 10) {
            secondInWord = "0" + String.valueOf(second);
        }
        return hourInWord + ":" + minuteInWord + ":" + secondInWord;
    }

    public MyTime nextSecond() {
        MyTime newTime = new MyTime(hour, minute, second);
        if (second == 59) {
            second = 0;
            if (minute == 59) {
                minute = 0;
                if (hour == 23) {
                    hour = 0;
                } else {
                    hour = hour + 1;
                }
            } else {
                minute = minute + 1;
            }
        } else {
            second = second + 1;
        }

        return newTime;
    }

    public MyTime nextMinute() {
        MyTime newTime = new MyTime(hour, minute, second);
        if (minute == 59) {
            minute = 0;
            if (hour == 23) {
                hour = 0;
            } else {
                hour = hour + 1;
            }
        } else {
            minute = minute + 1;
        }

        return newTime;
    }

    public MyTime nextHour() {
        MyTime newTime = new MyTime(hour, minute, second);
        if (hour == 23) {
            hour = 0;
        } else {
            hour = hour + 1;
        }

        return newTime;
    }

    public MyTime previousSecond() {
        MyTime newTime = new MyTime(hour, minute, second);
        if (second == 0) {
            second = 59;
            if (minute == 0) {
                minute = 59;
                if (hour == 0) {
                    hour = 23;
                } else {
                    hour = hour - 1;
                }
            } else {
                minute = minute - 1;
            }
        } else {
            second = second - 1;
        }

        return newTime;
    }

    public MyTime previousMinute() {
        MyTime newTime = new MyTime(hour, minute, second);
        if (minute == 0) {
            minute = 59;
            if (hour == 0) {
                hour = 23;
            } else {
                hour = hour - 1;
            }
        } else {
            minute = minute - 1;
        }

        return newTime;
    }

    public MyTime previousHour() {
        MyTime newTime = new MyTime(hour, minute, second);
        if (hour == 0) {
            hour = 23;
        } else {
            hour = hour - 1;
        }

        return newTime;
    }

}
