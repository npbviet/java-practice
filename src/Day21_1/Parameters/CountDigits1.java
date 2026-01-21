package Day21_1.Parameters;

public class CountDigits1 {
    public static void main(String[] args) {

        System.out.println(countDigits(-86521));
    }
    public static int countDigits (int x){
        int result = 0;
        int n = Math.abs(x);

        if (n == 0){
            return 1;
        }

        while(n > 0){
            n = n/10;
            result++;
        }

        return result;
    }
}
