class Solution {
    public int reverse(int x) {
        int res = 0;
        
        while(x != 0)
        {
            int last = x % 10;
            int n = res * 10 + last;
            if((n - last) / 10 != res)
            {
                return 0;
            }
            res = n;
            x /= 10;
        }
        return res;
    }
    
}
