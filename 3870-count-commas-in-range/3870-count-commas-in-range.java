class Solution {
    public int countCommas(int n) {
        if(n < 1000){
            return 0;
        }
        int count = 0;
        if(n >= 1000 && n <= 100000 ){
        count = n - 999;
        }
        return count;
    }
}