package Day28_1.ClassAndObject;

public class DateAbsoluteDay {
    private int month;
    private int day;
    private final int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public DateAbsoluteDay(int month, int day) {
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

    public int absoluteDay (){
        int sum = 0;
        for (int i = 0; i < this.month - 1; i++){
            sum += daysInMonths[i];
        }
        sum += this.day;
        return sum;
    }

    @Override
    public String toString() {

        return String.format("%02d/%02d", month, day);
    }
}