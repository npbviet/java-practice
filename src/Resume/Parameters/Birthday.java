package Resume.Parameters;

import java.util.*;

public class Birthday {
    public static final int DAY_OF_YEAR = 365;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("This program tells you how many days");
        System.out.println("it will be until your next birthday.");
        System.out.println();

        System.out.println("Please enter today's date:");
        System.out.print("What is the month (1-12)? ");
        int currentMonth = console.nextInt();

        int maxDayToday = daysInMonth[currentMonth - 1];
        System.out.print("What is the day   (1-" + maxDayToday + ")? ");
        int currentDay = console.nextInt();

        int nthToday = calDayInYear(currentDay, currentMonth, daysInMonth);
        System.out.printf("%d/%d is day #%d of %d.\n", currentMonth, currentDay, nthToday, DAY_OF_YEAR);
        System.out.println();

        System.out.println("Please enter your birthday:");
        System.out.print("What is the month (1-12)? ");
        int birthMonth = console.nextInt();

        int maxDayBirth = daysInMonth[birthMonth - 1];
        System.out.print("What is the day   (1-" + maxDayBirth + ")? ");
        int birthDay = console.nextInt();

        int nthBirthday = calDayInYear(birthDay, birthMonth, daysInMonth);
        System.out.printf("%d/%d is day #%d of %d.\n", birthMonth, birthDay, nthBirthday, DAY_OF_YEAR);
        System.out.println();

        printResult(nthToday, nthBirthday);
    }

    public static int calDayInYear(int day, int month, int[] daysInMonth) {
        int calDay = 0;
        for (int i = 0; i < month - 1; i++) {
            calDay += daysInMonth[i];
        }
        calDay += day;
        return calDay;
    }

    public static void printResult(int nthToday, int nthBirthday) {
        if (nthToday == nthBirthday) {
            System.out.println("Happy birthday!");
        } else {
            int restDay;
            if (nthBirthday > nthToday) {
                restDay = nthBirthday - nthToday;
            } else {
                restDay = 365 - nthToday + nthBirthday;
            }

            if (restDay == 1) {
                System.out.println("Wow, your birthday is tomorrow!");
            } else {
                System.out.printf("Your next birthday is in %d days.\n", restDay);
            }
        }
    }
}