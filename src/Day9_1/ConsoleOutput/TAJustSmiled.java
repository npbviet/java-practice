package Day9_1.ConsoleOutput;

public class TAJustSmiled {
    public static void main(String[] args) {
        verse1();
        verse2();
        verse3();
        verse4();
        verse5();
    }

    public static void verse1() {
        System.out.println("I once wrote a program that wouldn't compile");
        taSmiled();
    }

    public static void verse2() {
        System.out.println("My program did nothing");
        System.out.println("So I started typing.");
        coding();
    }

    public static void verse3() {
        System.out.println("\"Parse error,\" cried the compiler");
        System.out.println("Luckily I'm such a code baller.");
        quotes();
    }

    public static void verse4() {
        System.out.println("Now the compiler wanted an identifier");
        System.out.println("And I thought the situation was getting dire.");
        mainMethod();
    }

    public static void verse5() {
        System.out.println("Java complained it expected an enum");
        System.out.println("Boy, these computers really are dumb!");
        System.out.println("I added a class and called it Scum,");
        mainMethod();
    }

    public static void mainMethod() {
        System.out.println("I added a main method with its String[] args,");
        quotes();
    }

    public static void quotes() {
        System.out.println("I added a backslash to escape the quotes,");
        coding();
    }

    public static void coding() {
        System.out.println("I added System.out.println(\"I <3 coding\"),");
        taSmiled();
    }

    public static void taSmiled() {
        System.out.println("I don't know why it wouldn't compile,");
        System.out.println("My TA just smiled.");
        System.out.println();
    }
}