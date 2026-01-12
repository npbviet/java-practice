package Resume.ConsoleOutput;

public class CsRap2 {
    public static void main(String[] args) {
        verse1();
        verse2();
        verse3();
        verse4();
        verse5();
    }

    public static void intro() {
        System.out.println("Hey homies, my code is gonna rock this place");
        System.out.println("With a method named main and a curly brace");
    }

    public static void verse1() {
        intro();
        semicolon();
    }

    public static void verse2() {
        intro();
        jGrasp();
    }

    public static void verse3() {
        intro();
        compiles();
    }

    public static void verse4() {
        intro();
        ipl();
    }

    public static void verse5() {
        intro();
        System.out.println("I got full credit on external correctness");
        System.out.println("Hey playa check this, my code eats yours for breakfast");
        ipl();
    }

    public static void ipl() {
        System.out.println("Got help from the TAs in the IPL");
        System.out.println("But I didn't need it cause I code so well");
        compiles();
    }

    public static void compiles() {
        System.out.println("The first time I try, my code compiles");
        System.out.println("Lost a point for style cause my comments are vile");
        jGrasp();
    }

    public static void jGrasp() {
        System.out.println("jGrasp loves my code, no need to debug");
        System.out.println("I can rap in Java until it unplug");
        semicolon();
    }

    public static void semicolon() {
        System.out.println("I put a semicolon at the end of each line");
        System.out.println("You haters never seen code that looked so fine");
        System.out.println();
    }
}