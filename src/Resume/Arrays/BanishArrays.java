package Resume.Arrays;

import java.util.*;

public class BanishArrays {

    public static void main(String[] args)  {
        int[] a1 = {42, 3, 9, 42, 42, 0, 42, 9, 42, 42, 17, 8, 2222, 4, 9, 0, 1};
        int[] a2 = {42, 2222, 9};

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        banish(a1, a2);
        System.out.println(Arrays.toString(a1));
    }

    public static void banish(int[] a1, int[] a2) {
        if (a2.length == 0) {
            return;
        }

        int writeIndex = 0;

        for (int i = 0; i < a1.length; i++) {
            boolean isBannable = false;

            for (int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]) {
                    isBannable = true;
                    break;
                }
            }

            if (!isBannable) {
                a1[writeIndex] = a1[i];
                writeIndex++;
            }
        }

        for (int i = writeIndex; i < a1.length; i++) {
            a1[i] = 0;
        }
    }
}