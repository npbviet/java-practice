package Resume.FileIO;

import java.io.*;
import java.util.*;

public class AverageValueInFile1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.print("Nhập đường dẫn file: ");
        String linkF = console.nextLine();

        File file = new File(linkF);

        if (file.exists() && file.isFile()) {
            double average = averageValueInFile(file);
            System.out.println("Trung bình cộng của file là: " + average);
        } else {
            System.out.println("File không tồn tại hoặc đường dẫn sai!");
        }
    }


    public static double averageValueInFile(File file) throws FileNotFoundException  {
        Scanner reader = new Scanner(file);
        int count = 0;
        double sum = 0;
        while (reader.hasNextDouble()) {
            sum += reader.nextDouble();
            count++;
        }

        reader.close();

        if (count == 0) return 0;

        return (double) sum/count;
    }
}