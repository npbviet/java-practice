package Resume.Collection.StackQueue;

import java.util.*;

public class Stutter1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(List.of(1, 2, 3));
        stutter(q);
        System.out.println("Kết quả: " + q);
    }
    public static void stutter(Queue<Integer> q){
        int size = q.size();
        for (int i = 0; i < size; i++) {
            int val = q.remove();
            q.add(val);
            q.add(val);
        }
    }
}
