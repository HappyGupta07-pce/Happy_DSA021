class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int ans = 0;
        while(ans < costs.length && costs[ans] <= coins){
            coins -= costs[ans];
            ans++;
        }
        return ans;
    }
}