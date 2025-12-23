public class PrintProgram {
    public static void main(String[] args) {
        System.out.println("public class Hello {");
        System.out.printf("%4spublic static void main(String[] args) {\n", "");
        System.out.printf("%8sSystem.out.println(\"Hello, world!\");\n", "");
        System.out.printf("%4s}\n", "");
        System.out.println("}");
    }
}