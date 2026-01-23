package Day23_1;

import java.io.File;
import java.util.Arrays;

public class Crawl1 {

    public static void main(String[] args) {
        crawl("course");
    }

    public static void crawl(String name) {
        crawlS(new File(name), "");
    }
    private static void crawlS(File f, String indent) {
        System.out.println(indent + f.getName());

        if (f.isDirectory()) {
            String[] names = f.list();
            if (names != null) {
                Arrays.sort(names);
                for (String n : names) {
                    File child = new File(f, n);
                    crawlS(child, indent + "    ");
                }
            }
        }
    }
}
