class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int full = numBottles;
        int empty = full;
        int bottles = full;
        while(empty/numExchange > 0){
        full = empty / numExchange;
        empty %= numExchange;
        bottles += full;
        empty += full;
        }
        return bottles;
    }
}