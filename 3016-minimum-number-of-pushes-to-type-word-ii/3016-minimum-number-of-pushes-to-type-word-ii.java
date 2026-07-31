import java.util.Arrays;
class Solution {
    public int minimumPushes(String word) {
        int freq [] = new int[26];
        for(char c : word.toCharArray()){
            freq[c - 'a']++;
        }
        Arrays.sort(freq);

        int index = 0;
        int res = 0;

        for(int i = 25; i >= 0 ; i--){
        res = res + (index/8 + 1) * freq[i];
        index++;
        }
        return res;
    }
}