package Day21_1.Recursion;

public class CountToBy {
    public static void main (String[] args){
        countToBy(10,2);
    }
    public static void countToBy(int n, int m){
        if ( n < 1 || m < 1){
            throw new IllegalArgumentException();
        }
        if ( n <= m){
            System.out.print(n);
        } else {
            countToBy(n-m, m);
            System.out.print(", " + n);
        }
    }
}
