package Resume.Collection.StackQueue;

import java.util.*;

public class ReOrder1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(List.of(1, -2, 4, 5, -7, -9, -12, 28, -34));
        reorder(q);
        System.out.println("Kết quả: " + q);
    }

    public static void reorder(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        int size = q.size();

        for (int i = 0; i < size; i++) {
            int value = q.remove();
            if (value < 0) {
                stack.push(value);
            } else {
                q.add(value);
            }
        }
        int positives = size - stack.size();

        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

        for (int i = 0; i < positives; i++) {
            q.add(q.remove());
        }
    }
}