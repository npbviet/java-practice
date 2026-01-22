package Resume.Collection.StackQueue;

import java.util.*;

public class FlipHalf1 {
    public static void main (String[] args){
        Queue<Integer> q = new LinkedList<>(List.of(1, 8, 7, 2, 9, 18, 12, 0));
        flipHalf (q);
        System.out.println(q);
    }
    public static void flipHalf(Queue<Integer> q ) {
        Stack<Integer> s1 = new Stack<Integer>();
        Queue<Integer> q1 = new LinkedList<Integer>();
        int z = q.size();
        for (int i = 0; i < z; i++){
            int a = q.remove();
            if (i % 2 == 0){
                q1.add(a);
            } else {
                s1.push(a);
            }
        }

        while (!q1.isEmpty() || !s1.isEmpty()) {
            if (!q1.isEmpty()) {
                q.add(q1.remove());
            }
            if (!s1.isEmpty()) {
                q.add(s1.pop());
            }
        }
    }
}
