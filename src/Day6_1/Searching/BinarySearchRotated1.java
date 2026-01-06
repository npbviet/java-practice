package Day6_1.Searching;

public class BinarySearchRotated1 {
    public static void main(String[] args) {

        int[] a = {10, 19, 22, -8, 0, 3, 6};


        int target = 22;
        int result = binarySearchRotated(a, target);

        System.out.println("int[] a = [10, 19, 22, -8, 0, 3, 6];");
        System.out.printf("int index = binarySearch(a, %d) // %d", target, result);
    }

    private static int binarySearchRotated(int[] a, int target) {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (a[mid] == target) {
                return mid;
            }

            if (a[left] <= a[mid]) {
                if (target >= a[left] && target < a[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            else {
                if (target > a[mid] && target <= a[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
