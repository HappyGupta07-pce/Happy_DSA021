import java.util.*;

class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int freq = 0;
        for (int fre : map.values())
            freq = Math.max(freq, fre);
        int ans = Integer.MAX_VALUE;
        for (int key : map.keySet()) {
            if (map.get(key) == freq) {
                int l = 0, r = nums.length - 1;
                while (l <= r) {
                    if (nums[l] == key)
                        break;
                    l++;
                }
                while (l < r) {
                    if (nums[r] == key)
                        break;
                    r--;
                }
                ans = Math.min(ans, r - l + 1);
            }
        }
        return ans;
    }
}