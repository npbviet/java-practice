package Resume.ConsoleOutput;

//public class SixDays {
//    public static void main(String[] args) {
//        String[] days = {"1st", "2nd", "3rd", "4th", "5th", "6th"};
//        String[] songs = {"a partridge in a pear tree.",
//                "two turtle doves, and",
//                "three French hens,",
//                "four calling birds,",
//                "five golden rings,",
//                "six geese a-laying,"};
//        for (int i = 0; i < days.length; i++){
//            System.out.printf("On the %s day of \"Xmas\", my true love gave to me%n", days[i]);
//            for (int j = i; j >= 0; j--){
//                String repeat = songs[j];
//                System.out.println(repeat);
//            }
//            System.out.println();
//        }
//    }
//}
public class SixDays {
    public static void main(String[] args) {
        day1();
        day2();
        day3();
        day4();
        day5();
        day6();
    }

    public static void intro(String day) {
        System.out.println("On the " + day + " day of \"Xmas\", my true love gave to me");
    }

    public static void day1() {
        intro("1st");
        partridge();
        System.out.println();
    }

    public static void day2() {
        intro("2nd");
        doves();
        partridge();
        System.out.println();
    }

    public static void day3() {
        intro("3rd");
        hens();
        doves();
        partridge();
        System.out.println();
    }

    public static void day4() {
        intro("4th");
        birds();
        hens();
        doves();
        partridge();
        System.out.println();
    }

    public static void day5() {
        intro("5th");
        rings();
        birds();
        hens();
        doves();
        partridge();
        System.out.println();
    }

    public static void day6() {
        intro("6th");
        laying();
        rings();
        birds();
        hens();
        doves();
        partridge();
        System.out.println();
    }

    public static void partridge() {
        System.out.println("a partridge in a pear tree.");
    }

    public static void doves() {
        System.out.println("two turtle doves, and");
    }
    public static void hens() {
        System.out.println("three French hens,");
    }
    public static void birds() {
        System.out.println("four calling birds,");
    }
    public static void rings() {
        System.out.println("five golden rings,");
    }
    public static void laying() {
        System.out.println("six geese a-laying,");
    }
}