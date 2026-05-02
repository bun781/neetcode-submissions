class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] list = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            int product = 1;
            for (int i = 0; i < nums.length; i++) {
                if (i != j) {
                    product *= nums[i];
                }
            }
            list[j] = product;
        }
        return list;
    }
}  
