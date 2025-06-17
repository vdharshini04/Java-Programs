class Solution {
    public boolean isPalindrome(int n) {
        int r=reverseNumber(n);
        if(n==r){
            return true;
        }
        else
            return false;
    }
    public int reverseNumber(int n) {
        int r=0,t=0;
        while(n>0){
            t=n%10;
            r=(r*10)+t;
            n/=10;
        }
        return r;
    }
}