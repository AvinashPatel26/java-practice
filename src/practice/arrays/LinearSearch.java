package practice.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 14, 77, 50};

        boolean result = linearSearch(arr, 14);
        System.out.println(result);
    }

    private static boolean linearSearch(int[] arr, int target) {
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}