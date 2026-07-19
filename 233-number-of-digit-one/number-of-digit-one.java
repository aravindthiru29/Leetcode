class Solution {
    public int countDigitOne(int k) {
        int count = 0, factor = 1, n = k;
        while(n > 0){
            int m = n/10, r = n%10, amount;
            if(r == 0) amount = 0;
    	    else if(r > 1) amount = factor;
    	    else amount = k%factor+1;
            count += m*factor + amount;
    	    factor *= 10;
    	    n = n/10;
        }
        return count;
    }
}