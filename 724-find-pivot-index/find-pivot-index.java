class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int i; 
        int sum =0;
        
        for(i=0;i<n;i++)
        {
            sum=nums[i]+sum;
        }

        int lsum=0;
        int rsum=sum;
       
        for(i=0;i<n;i++)
        {
            rsum=rsum-nums[i];

            if(rsum==lsum)
            {
                return i;
            }
            else
            {
                lsum+=nums[i];
            }
        }

        return -1;
    }
}