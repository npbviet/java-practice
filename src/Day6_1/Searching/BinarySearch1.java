package Day6_1.Searching;

public class BinarySearch1 {
    public static void main(String[] args) {

        int[] a = {-4,  2,  7, 10, 15, 20, 22, 25, 30, 36, 42, 50, 56, 68, 85, 92, 103};

        int min = 0;
        int max = a.length - 1;
        int target = 30;
        int result = binarySearch(a, target, min, max);

        System.out.println("int[] a = {-4,  2,  7, 10, 15, 20, 22, 25, 30, 36, 42, 50, 56, 68, 85, 92, 103};");
        System.out.printf("int index = binarySearch(a, %d) // %d", target, result);
    }

    private static int binarySearch(int[] a, int target, int min, int max) {
        int mid = (min + max) / 2;

        if (min > max) {
            return -1;
        }

        if (a[mid] == target) {
            return mid;
        } else if (a[mid] < target) {
            return binarySearch(a, target, mid + 1, max);
        } else {
            return binarySearch(a, target, min, mid - 1);
        }
    }
}
