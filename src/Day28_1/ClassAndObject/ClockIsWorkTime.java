package Day28_1.ClassAndObject;

public class ClockIsWorkTime {
    private int hour;
    private int minute;
    private String amPm;

    public ClockIsWorkTime(int hour, int minute, String amPm) {
        this.hour = hour;
        this.minute = minute;
        this.amPm = amPm;
    }

    public void advance(int minutes) {
        for (int i = 0; i < minutes; i++) {
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour == 12) {
                    amPm = (amPm.equalsIgnoreCase("AM") ? "PM" : "AM");
                } else if (hour > 12) {
                    hour = 1;
                }
            }
        }
    }

    public final int getHour() {
        return hour;
    }

    public final int getMinute() {
        return minute;
    }

    public final String getAmPm() {
        return amPm;
    }

    public final String toString() {
        String result = hour + ":";
        if (minute < 10) {
            result += "0" + minute;
        } else {
            result += minute;
        }
        result += " " + amPm;
        return result;
    }

    public boolean equals(Object o) {
        if (o instanceof ClockIsWorkTime) {
            ClockIsWorkTime t = (ClockIsWorkTime) o;
            return t.hour == this.hour && t.minute == this.minute && t.amPm.equals(this.amPm);
        } else {
            return false;
        }
    }

    public boolean isWorkTime(){
        if (this.amPm.equalsIgnoreCase("AM")){
            if (this.hour >= 9 && this.hour < 12) {
                return true;
            } else {
                return false;
            }
        } else {
            if (this.hour < 5) {
                return true;
            } else if (this.hour == 5 && this.minute == 0){
                return true;
            } else if (this.hour == 12){
            return true;
            } else {
                return false;
            }
        }
    }
}
