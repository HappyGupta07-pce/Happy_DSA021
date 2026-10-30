class Solution {
    public String convertToTitle(int columnNumber) {
        int n = columnNumber;
        StringBuilder res = new StringBuilder();
        while(n > 0){
            n--;
            int curr = n % 26;
            n /= 26;
            res.append((char)(curr+'A'));
        }
        return res.reverse().toString();
    }
}