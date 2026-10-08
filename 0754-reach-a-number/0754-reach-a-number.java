class Solution {
    public int reachNumber(int target) {
        int steps = 0, sum = 0;
        target = Math.abs(target);
        while(sum < target){
            sum += steps;
            steps++;
        }
        while((sum - target)% 2 != 0){
            sum += steps;
            steps++;
        }
        return steps - 1;
    }
}