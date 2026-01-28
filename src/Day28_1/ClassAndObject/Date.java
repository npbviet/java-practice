package Day28_1.ClassAndObject;

public class Date {
    private int month;
    private int day;
    private final int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int month, int day) {
        this.month = month;
        this.day = day;
    }

    public int daysInMonth() {
        return daysInMonths[month - 1];
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public void nextDay() {
        day++;

        if (day > daysInMonth()) {
            day = 1;
            month++;

            if (month > 12) {
                month = 1;
            }
        }
    }

    @Override
    public String toString() {

        return String.format("%02d/%02d", month, day);
    }
}