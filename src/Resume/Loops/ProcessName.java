package Resume.Loops;

import java.util.*;

public class ProcessName {
    public static void main (String [] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Type your name: ");
        String firstname = console.next();
        firstname = firstname.charAt(0) + ".";

        String lastname = console.next();
        String name = lastname + ", " + firstname;

        System.out.println("Your name is: " + name );
    }
}