package Day21_1.Parameters;

public class ComputeDistance1 {
    public static void main(String[] args) {
        double d = computeDistance(10, 2, 3, 5);
        System.out.println("Distance is: " + d);
    }
    public static double computeDistance (int x1, int y1, int x2, int y2){
        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return result;
    }
}
