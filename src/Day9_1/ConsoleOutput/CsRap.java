package Day9_1.ConsoleOutput;

public class CsRap {
    public static void main(String[] args) {
        verse1();
        verse2();
        verse3();
        verse4();
        verse5();
    }

    public static void intro() {
        System.out.println("You wanna be a coder?");
        System.out.println("You better say it louder");
    }

    public static void verse1() {
        intro();
        marty();
    }

    public static void verse2() {
        intro();
        graded();
    }

    public static void verse3() {
        intro();
        tight();
    }

    public static void verse4() {
        intro();
        println();
    }

    public static void verse5() {
        intro();
        System.out.println("My code it runs so well");
        System.out.println("Got help in the IPL");
        println();
    }

    public static void println() {
        System.out.println("You know my program's rockin");
        System.out.println("I'm master of the println");
        tight();
    }

    public static void tight() {
        System.out.println("My indentation's right");
        System.out.println("The code looks hella tight");
        graded();
    }

    public static void graded() {
        System.out.println("In 142 I'm hated");
        System.out.println("Score full points when I'm graded");
        marty();
    }

    public static void marty() {
        System.out.println("I joined the CS party");
        System.out.println("Like \"LN\" and Marty");
        System.out.println();
    }
}