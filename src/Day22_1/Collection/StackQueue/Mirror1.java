package Day22_1.Collection.StackQueue;

import java.util.*;

public class Mirror1 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>(List.of("a", "b", "c"));

        System.out.println("Trước khi mirror: " + q);
        mirror(q);
        System.out.println("Sau khi mirror : " + q);
    }

    public static void mirror(Queue<String> q) {
        if (q == null || q.isEmpty()) {
            return;
        }

        Stack<String> s = new Stack<>();
        int originalSize = q.size();

        for (int i = 0; i < originalSize; i++) {
            String item = q.remove();
            s.push(item);
            q.add(item);
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
}
