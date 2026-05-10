package practice.arrays;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {18, 124, 9, 1764, 98, 1};
        int result = findNumbers(arr);
        System.out.println(result);
    }

    static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {

        if (num == 0) return false; // 0 has 1 digit

        num = Math.abs(num); // handle negatives

        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count % 2 == 0;
    }
}