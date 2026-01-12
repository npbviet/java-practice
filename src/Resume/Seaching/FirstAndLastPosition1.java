package Resume.Seaching;

import java.util.Arrays;

public class FirstAndLastPosition1 {
    public static void main(String[] args) {
        int[] a = {-4, 1, 7, 7, 7, 7, 7, 9, 9, 15, 22};
        int target = 9;

        int[] result = firstAndLastPosition(a, target);

        System.out.println("int[] a = [-4, 1, 7, 7, 7, 7, 7, 9, 9, 15, 22];");
        System.out.printf("Vị trí của %d là: %s", target, Arrays.toString(result));
    }

    public static int[] firstAndLastPosition(int[] a, int target) {
        int first = findBound(a, target, true);
        int last = findBound(a, target, false);
        return new int[] {first, last};
    }

    private static int findBound(int[] a, int target, boolean isFirst) {
        int left = 0;
        int right = a.length - 1;
        int bound = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (a[mid] == target) {
                bound = mid;
                if (isFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (a[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return bound;
    }
}