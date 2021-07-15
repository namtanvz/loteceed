class Solution {
    public boolean isPalindrome(int x) {
        int n = 0;
        int a = x;
        
        while(x > 0){
            n = n  * 10 + x % 10;
            x = x/10;
        }
        
        if(a == n)
        {
            return true;
        }
        return false;

    }
}
