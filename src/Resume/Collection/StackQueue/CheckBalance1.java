package Resume.Collection.StackQueue;

import java.util.*;

public class CheckBalance1 {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("PLease enter your String: ");
        System.out.println("Your string encounter errors at: " + checkBalance(console.next()));
    }
    public static int checkBalance(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++){

            char c = s.charAt(i);
            if (c == '{' || c == '(' ) {
                stack.push(c);
            } else if (c == '}' || c == ')') {
                if (stack.isEmpty()) {
                    return i;
                }

                char open = stack.pop();

                if ((open == '(' && c != ')') || (open == '{' && c != '}')) {
                    return i;
                }

            }
        }

        if (!stack.isEmpty()) {
            return s.length();
        }

        return -1;
    }
}
