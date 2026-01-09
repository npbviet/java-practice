package Day6_1.Searching;

public class BinarySearch1 {
    public static void main(String[] args) {
        int[] a = {-4, 2, 7, 10, 15, 20, 22, 25, 30, 36, 42, 50, 56, 68, 85, 92, 103};
        int target = 30;

        int result = binarySearch(a, target);

        System.out.println("int[] a = {-4, 2, 7, 10, 15, 20, 22, 25, 30, 36, 42, 50, 56, 68, 85, 92, 103};");
        System.out.printf("int index = binarySearch(a, %d) // %d", target, result);
    }

    public static int binarySearch(int[] a, int target) {
        return binarySearchRecursive(a, target, 0, a.length - 1);
    }

    private static int binarySearchRecursive(int[] a, int target, int min, int max) {
        if (min > max) {
            return -1;
        }

        int mid = min + (max - min) / 2;

        if (a[mid] == target) {
            return mid;
        } else if (a[mid] < target) {
            return binarySearchRecursive(a, target, mid + 1, max);
        } else {
            return binarySearchRecursive(a, target, min, mid - 1);
        }
    }
}