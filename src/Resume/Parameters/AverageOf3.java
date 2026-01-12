package Resume.Parameters;

public class AverageOf3 {
    public static double tinhTrungBinh(int x, int y, int z) {
        return (x + y + z) / 3.0;
    }
    public static void main(String[] args) {
        System.out.println("Trung bình cộng là: " + tinhTrungBinh(1, 2, 3));
        System.out.println("Trung bình cộng là: " + tinhTrungBinh(4, 7, 13));
    }
}