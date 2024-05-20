class Solution{
    public long PowMod(long x, long n, long m){
        long result = 1;
        x = x % m;   
        while (n > 0){
            if ((n & 1) == 1)
                result = (result * x) % m;
            n = n >> 1;  
            x = (x * x) % m;  
        }
        return result;
    }
}
