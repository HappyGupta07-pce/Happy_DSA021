class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        int oddCount = 0;
        for(int i : nums1){
            min = Math.min(min, i);
            if(i % 2 == 1)oddCount++;
        }
        return oddCount == 0 || min % 2 != 0;
    }
}