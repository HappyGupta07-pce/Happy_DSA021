class Solution {
    public int missingNumber(int[] nums) {
        int actualSum = 0;
        int n = nums.length;
        int sum = n * (n + 1)/2;
        for (int num : nums){
            actualSum += num; 
        }
        return sum - actualSum;
    }
}