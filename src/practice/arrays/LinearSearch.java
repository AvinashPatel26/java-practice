package practice.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 14, 77, 50};

        int result = linearSearch(arr, 14);
        System.out.println(result);
    }

    private static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) return -1;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}