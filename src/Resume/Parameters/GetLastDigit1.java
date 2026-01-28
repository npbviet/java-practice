package Resume.Parameters;

public class GetLastDigit1 {
    public static void main(String[] args) {

        System.out.println(getLastDigit(-86521));
    }
    public static int getLastDigit (int x){
        int n = Math.abs(x);

        if (n == 0){
            return 1;
        } else {
            return n%10;
        }
    }
}
