package Resume.Parameters;

public class AverageOf3Cal {
    public static double averageOf3(int x, int y, int z) {
        return (x + y + z) / 3.0;
    }
    public static void main(String[] args) {
        System.out.println("Trung bình cộng là: " + averageOf3(1, 2, 3));
        System.out.println("Trung bình cộng là: " + averageOf3(4, 7, 13));
    }
}