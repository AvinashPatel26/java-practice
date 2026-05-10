package practice.arrays;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {23,43,12,34,56,1, 0};
        System.out.println(minimum(arr));
    }

    private static int minimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        if (arr.length == 1){
            return arr[0];
        }
        for (int idx = 0; idx < arr.length; idx++){
            if (arr[idx]<min){
                min = arr[idx];
            }
        }
        return min;
    }
}
