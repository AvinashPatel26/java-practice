package practice.arrays;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr ={
                {23,4,1},
                {14,23,45,2},
                {22,34,5,19},
                {12,45}
        };
        int target = 12;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] search(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;
        for (int i =0; i< row; i++){
            for (int j = 0; j <col; j++){
                if (arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}