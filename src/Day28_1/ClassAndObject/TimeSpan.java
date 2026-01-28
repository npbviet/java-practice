package Day28_1.ClassAndObject;

public class TimeSpan {
    private int totalMinutes;

    public TimeSpan(int hours, int minutes) {
        this.totalMinutes = hours * 60 + minutes;
    }

    public int getHours() {
        return totalMinutes / 60;
    }

    public int getMinutes() {
        return totalMinutes % 60;
    }

    public void add(int hours, int minutes) {
        this.totalMinutes += (hours * 60 + minutes);
    }

    public void add(TimeSpan other) {
        this.totalMinutes += other.totalMinutes;
    }

    public double getTotalHours() {
        return totalMinutes / 60.0;
    }

    @Override
    public String toString() {
        return getHours() + "h" + getMinutes() + "m";
    }
}
