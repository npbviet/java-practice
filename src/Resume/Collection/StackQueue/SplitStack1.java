package Resume.Collection.StackQueue;

import java.util.*;

public class SplitStack1 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.addAll(List.of(4, 0, -1, 5, -6, -3, 2, 7));
        splitStack(s);
        System.out.println("Kết quả: " + s);
    }

    public static void splitStack(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<>();
        while (!s.isEmpty()){
            q.add(s.pop());
        }
        int size = q.size();
        for (int i = 0; i < size; i++){
            int val = q.remove();
            if (val >= 0){
                q.add(val);
            } else {
                s.push(val);
            }
        }

        while (!q.isEmpty()){
            s.push(q.remove());
        }
    }
}