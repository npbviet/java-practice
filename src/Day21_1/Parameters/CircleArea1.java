package Day21_1.Parameters;

public class CircleArea1 {
    public static void main(String[] args) {
        double radius = 5.0;
        System.out.println("Diện tích hình tròn là: " + circleArea(radius));
    }
    public static double circleArea (double r){
        double area = Math.PI * Math.pow(r, 2);
        return area;
    }
}