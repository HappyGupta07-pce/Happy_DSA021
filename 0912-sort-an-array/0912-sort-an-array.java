class Solution {
    public int[] sortArray(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int num : nums){
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        int counting[] = new int[max - min + 1];
        for(int num : nums){
            counting[num - min]++;
        }
        int index = 0;
        for(int i = 0;i < counting.length;i++){
          while(counting[i] > 0){
            nums[index++] = i + min;
            counting[i]--;
          }
        }
        return nums;
    }
}