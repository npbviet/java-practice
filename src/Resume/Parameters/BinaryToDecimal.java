package Resume.Parameters;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println("Số chuyển đổi là: " + decimalOf(101011));
    }

    public static double decimalOf(int binaryNum) {
        int decimalNum = 0;
        int x = 0;
        while (binaryNum > 0) {
            int y = binaryNum%10;
            decimalNum += y*Math.pow(2, x);
//            System.out.println("Số hiện tại: " + decimalNum);
            binaryNum = binaryNum/10;
            x++;
//            System.out.println("Số lần thực hiện: " + x);
        }
        return decimalNum;
    }
}

//Cách thực hiện: Khai báo int để lấy số nguyên
// Lấy số chia 10 lấy dư để lấy số ngoài cùng.
// Sau mỗi lần thực hiện thì chia cho 10, loại bỏ phần vừa tính
// Lấy x là số lần tính, y là ngoài cùng, tính y*2^x
// Lấy decimalNum + kết quả vừa tính, kết quả cuối cùng là số cần tìm