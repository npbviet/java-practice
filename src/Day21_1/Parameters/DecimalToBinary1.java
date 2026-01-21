package Day21_1.Parameters;

public class DecimalToBinary1 {
    public static void main (String[] args){
        System.out.println(decimalToBinary(43));
    }
    public static int decimalToBinary(int x) {
        int binaryNum = 0;
        int placeValue = 1;

        while (x > 0) {
            int remainder = x % 2;
            binaryNum += remainder * placeValue;
            x = x / 2;
            placeValue *= 10;
        }
        return binaryNum;
    }
}
