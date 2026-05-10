package practice.arrays;

public class MaxximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {4, 5, 6}
        };

        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }

    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;

        for (int[] customer : accounts) {
            int sum = 0;

            for (int money : customer) {
                sum += money;
            }

            if (sum > ans) {
                ans = sum;
            }
        }

        return ans;
    }
}