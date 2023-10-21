public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int lisLength = lengthOfLIS(nums);

        System.out.println("Length of Longest Increasing Subsequence: " + lisLength);
    }

    public static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] lis = new int[n];

        // Initialize LIS values for all indexes
        for (int i = 0; i < n; i++) {
            lis[i] = 1;
        }

        // Compute optimized LIS values in a bottom-up manner
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        // Find the maximum LIS value
        int maxLIS = 1;
        for (int i = 0; i < n; i++) {
            if (lis[i] > maxLIS) {
                maxLIS = lis[i];
            }
        }

        return maxLIS;
    }
}
