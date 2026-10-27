class Solution {
    public int reverse(int x) 
    {
        return reverseHelper(x, 0);
    }

    private int reverseHelper(int x, int res) 
    {
        if (x == 0) {
            return res;
        }

        int digit = x % 10;

    
        if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > 7)) 
        {
            return 0;
        }

        if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && digit < -8)) 
        {
            return 0;
        }

        return reverseHelper(x / 10, res * 10 + digit);
    }
}