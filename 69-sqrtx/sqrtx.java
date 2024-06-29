class Solution {
    public int mySqrt(int x) {
        long low=1;
        long high=x;
        long mid;
        long res=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(mid*mid<=x)
            {
                res=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }


        }
        return (int)res;
    }
}