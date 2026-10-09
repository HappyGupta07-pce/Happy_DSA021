class Solution {
    public int missingNumber(int[] nums) {
        int Xor = nums.length;
        for(int i = 0; i < nums.length; i++){
            Xor ^= i;
            Xor ^= nums[i];
        }
        return Xor;
    }
}