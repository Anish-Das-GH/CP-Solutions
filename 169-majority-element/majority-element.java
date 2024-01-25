class Solution {
    public int majorityElement(int[] nums) {
        // int i,j=0;
        
        // int n=nums.length;
        // for(i=0;i<n;i++)
        // {
        //     int count=0;
        //     for(j=0;j<n;j++)
        //     {
        //         if(nums[j]==nums[i])
        //         {
        //             count++;
        //         }
                
        //     }
        //     if(count>(n/2))
        //     {
        //         return nums[i];
        //     }
        // }
        // return 1;

        int i=0;
        int count=0;
        int size=nums.length;
        Arrays.sort(nums);
        if(size==1)
        {
            return nums[0];
        }
        else
        {
            for(i=0;i<size;i++)
            {
                if(nums[i]==nums[i+1])
                {
                    count++;
                }
                else
                {
                    count=0;
                }
                if(count>=(size/2))
                {
                    return nums[i];
                }
            }
        }
        return -1;


    }
}