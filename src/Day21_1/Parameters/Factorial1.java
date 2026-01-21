package Day21_1.Parameters;

public class Factorial1 {
    public static void main(String[] args){
        System.out.println(factorCount(4));
    }
    public static int factorCount (int x){
        int sum = 1;
        if (x == 0){
            return 1;
        }

        for (int i = 1; i <= x; i++){
            sum = sum*i;
        }

        return sum;
    }
}
