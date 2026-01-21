package Day21_1.Parameters;

import java.util.Stack;

public class FactorCount1 {
    public static void main(String[] args){
        System.out.println(factorCount(24));
    }
    public static int factorCount (int x){
        int count = 0;

        for (int i = 1; i <= x; i++){
            if (x % i == 0){
                count++;
            }
        }

        return count;
    }
}
