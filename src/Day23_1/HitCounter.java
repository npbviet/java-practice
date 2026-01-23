package Day23_1;

import java.util.*;

public class HitCounter {
    public static int Size;
    public static ArrayList<Integer> counter = new ArrayList<Integer>();
    public HitCounter (int x){
        Size = x;
    }

    public static void main (String[] args){
        HitCounter counter = new HitCounter(5);
        counter.hit(7);
        counter.hit(7);
        counter.hit(7);
        counter.hit(7);
        counter.hit(7);
    }
    public static void hit(int x){
        int a  = counter.size();

        if (x < 0) {
            return;
        }

        checkLength(x, a);
        int count = counter.get(x);
        if (x >= 0) {
            count++;
            counter.set(x, count);
            System.out.println(x + ": " + count);
        }
    }

    public static int getHits(int x){
        int min = x - Size;
        int sum = 0;
        int a  = counter.size();

        checkLength(x, a);
        if (min <= 0 && x >= 0) {
            for(int i = 0; i <= Size; i++){
                checkLength(x, a);
                int count = counter.get(i);
                System.out.println(i+ ": "+ count);
                sum += count;

            }
        } else {
            for (int i = min + 1; i <= x; i++){
                int count = counter.get(i);
                System.out.println(i+ ": "+ count);
                sum += count;
            }
        }

        return sum;
    }
    public static void checkLength (int x, int size) {
        if (x >= size){
            for (int i = size; i < x+1; i++){
                counter.add(i, 0);
            }
        }
    }
}





