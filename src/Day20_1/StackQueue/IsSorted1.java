package Day20_1.StackQueue;

import java.util.*;

public class IsSorted1 {
    public static void main (String[] args){
        Stack<Integer> s = new Stack<>();
        s.addAll(List.of(18, 12, 15, 6, 1));

        if (isSorted(s)){
            System.out.println(s + " is sorted");
        } else {
            System.out.println(s + " isn't sorted");
        }

    }
    public static boolean isSorted(Stack<Integer> s ) {
        if (s.isEmpty() || s.size() == 1){
            return true;
        }
        Queue<Integer> q = new LinkedList<Integer>();
        boolean sorted = true;

        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        while(!q.isEmpty()){
            int a = q.remove();
            if (!s.isEmpty() && a < s.peek()){
                sorted = false;
            }
            s.push(a);
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }

        while(!q.isEmpty()){
            s.push(q.remove());
        }
        return sorted;
    }
}
