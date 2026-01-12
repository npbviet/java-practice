package Day12_1.FileIO;

import java.util.Scanner;
import java.io.File;

public class AskFileName1 {

    public static void main(String[] args) {
        String validFile = askFileName();
        if (validFile == null){
            System.out.println("Your file doesn't exist");
        } else {
            System.out.println("Bạn đã chọn tệp: " + validFile);
        }
    }

    public static String askFileName() {
        Scanner console = new Scanner(System.in);

        while (true) {
            System.out.print("Type a file name: ");
            String fileName = console.nextLine();


            File file = new File(fileName);

            if (file.exists()) {
                return file.getName();
            } else {
                System.out.println("Your file doesn't exist");
            }
        }
    }
}