
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        int[][] a = new int[n][2];

        // store value + original index
        for (int i = 0; i < n; i++) {
            a[i][0] = nums[i];
            a[i][1] = i;
        }

        // sort by value
        Arrays.sort(a, (x, y) -> Integer.compare(x[0], y[0]));

        int i = 0, j = n - 1;

        while (i < j) {
            int sum = a[i][0] + a[j][0];

            if (sum == target) {
                int idx1 = a[i][1];
                int idx2 = a[j][1];
                return new int[] {
                    Math.min(idx1, idx2),
                    Math.max(idx1, idx2)
                };
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[] {};
    }
}