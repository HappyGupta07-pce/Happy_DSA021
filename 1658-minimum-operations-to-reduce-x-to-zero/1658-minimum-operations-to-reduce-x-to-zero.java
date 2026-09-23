import java.util.*;
class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int total = 0;
        for(int num : nums){
            total += num;
        }
        int target = total - x;

        if(target < 0){
            return -1;
        }

        if(target == 0){
            return n;
        }
        
        int sum = 0;
        int left = 0;
        int maxL = -1;
        for(int right = 0; right < n;right++){
            sum += nums[right];
            while(sum > target){
                sum -= nums[left];
                left++;
            }
            if(sum == target){
                maxL = Math.max(maxL, right - left + 1);
            }
        }
        if(maxL == -1){
            return -1;
        }
        return n - maxL;
    }
}