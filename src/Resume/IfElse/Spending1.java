package Resume.IfElse;

import java.util.*;

public class Spending1 {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String person = console.next();
        System.out.print("How much will " + person + " be spending? ");
        double amount = console.nextDouble();
        System.out.println();

        spending(person,amount);
    }
    public static void spending(String name, double amount){

        int numBills = (int) (amount / 20.0);
        if (numBills * 20.0 < amount) {
            numBills++;
        }

        System.out.println(name + " needs " + numBills + " bills");
    }
}
