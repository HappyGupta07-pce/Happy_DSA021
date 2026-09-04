class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int Suffixmin[] = new int[n];
        Suffixmin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            Suffixmin[i] = Math.min(nums[i], Suffixmin[i + 1]);
        }

        int Prefixmax = 0;

        for (int i = 0; i < n; i++) {
            Prefixmax = Math.max(Prefixmax, nums[i]);
            int instabilityScore = Prefixmax - Suffixmin[i];
            if (instabilityScore <= k) {
                return i;
            }
        }
        return -1;
    }
}