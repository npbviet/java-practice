package Day21_1.Parameters;

public class GetFirstDigit1 {
    public static void main(String[] args) {

        System.out.println(getFirstDigit(-86521));
    }
    public static int getFirstDigit (int x){
        int n = Math.abs(x);

        if (n == 0){
            return 1;
        }

        while(n >= 10){
            n = n/10;
        }

        return n;
    }
}
