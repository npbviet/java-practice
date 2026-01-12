package Resume.IfElse;

public class DateIsBeforeCal {
    public static void main(String[] args) {
        System.out.println(dateIsBefore(8, 15, 8, 16));
    }

    public static boolean dateIsBefore(int m1, int d1, int m2, int d2) {
        if (!isValidDate(m1, d1) || !isValidDate(m2, d2)) {
            System.out.println("Data not found");
            return false;
        }

        return (m1 < m2) || (m1 == m2 && d1 < d2);
    }

    private static boolean isValidDate(int month, int day) {
        return (month >= 1 && month <= 12) && (day >= 1 && day <= 31);
    }
}