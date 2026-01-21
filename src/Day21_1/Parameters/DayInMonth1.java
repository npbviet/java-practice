package Day21_1.Parameters;

public class DayInMonth1 {

    public static void main (String[] args){
        System.out.println(dayInMonth(9));
    }
    public static int dayInMonth(int month){
        int [] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month > 0 && month < 13){
            return days[month-1];
        } else {
            return -1;
        }
    }
}
