class Solution {
public:
    bool isPalindrome(int x) {
        long long rev = 0;
        int org = x;
        while(x > 0){
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        if(org == rev){
            return true;
        }
        else{
            return false;
        }
    }
};