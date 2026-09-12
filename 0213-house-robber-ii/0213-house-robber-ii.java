class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1)return nums[0];

        int case1 = roblinear(nums, 1, n - 1);
        int case2 = roblinear(nums, 0, n - 2);

        return Math.max(case1, case2);
    }
    private int roblinear(int[] nums, int start, int end){
        int prev1 = 0;
        int prev2 = 0;

        for(int i = start; i <= end; i++){
            int money = Math.max(prev1, nums[i] + prev2);
            prev2 = prev1;
            prev1 = money;
        }
        return prev1;
    }
}