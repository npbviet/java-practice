package Day22_12.ParameterAndReturn;

import java.util.*;

public class Birthday {
    public static final int DAY_OF_YEAR = 365;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Please enter today's date:");
        System.out.print("What is the month (1-12)? ");
        int currentMonth = console.nextInt();

        System.out.print("What is the day (1-31)? ");
        int currentDay = console.nextInt();

        int nthToday = calDayInYear(currentDay, currentMonth);

        System.out.printf("%d/%d is day %d of %d\n", currentDay, currentMonth, nthToday, DAY_OF_YEAR);

        //Ngày sinh nhật
        System.out.println("Please enter your birthday:");
        System.out.print("What is the month (1-12)? ");
        int birthMonth = console.nextInt();

        System.out.print("What is the day (1-30)? ");
        int birthDay = console.nextInt();

        int nthBirthday = calDayInYear(birthDay, birthMonth);

        System.out.printf("%d/%d is day %d of %d\n", birthDay, birthMonth, nthBirthday, DAY_OF_YEAR);

        int restDay = 0;
        if (nthBirthday > nthToday) {
            restDay = nthBirthday - nthToday;
        } else {
            restDay = 365 - nthToday + nthBirthday;
        }
        System.out.printf("Your next birthday in %d\n", restDay);
    }

    //Hàm tính ngày trong năm
    public static int calDayInYear(int day, int month) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int calDay = 0;

        for (int i = 0; i < month - 1; i++) {
            calDay += daysInMonth[i];
        }
        calDay += day;
        return calDay;
    }
}