package Resume.Parameters;

public class BinaryToDecimal1 {
    public static void main(String[] args) {
        System.out.println("Số chuyển đổi là: " + binaryToDecimal(101011));
    }

    public static int binaryToDecimal(int binaryNum) {
        int decimalNum = 0;
        int x = 0;
        while (binaryNum > 0) {
            int y = binaryNum%10;
            decimalNum += y*Math.pow(2, x);
            binaryNum = binaryNum/10;
            x++;
        }
        return decimalNum;
    }
}
