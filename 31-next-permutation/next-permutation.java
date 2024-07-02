class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        //null check
        if(n==0||n<=1)
        {
            return;
        }
        //randomly choosing breakpoint second last element
        int brk = n-2;
        //finding break point
        for(int i=n-1;i>0;i--)
        {
            if(nums[i]<=nums[i-1])
            {
                brk--;
            }
            else
            {
                break;
            }
        }
        //if the break point exceeds then we have to reverse
        if(brk==-1)
        {
            reverse(nums,0,n-1);
            return;
        }

        //or else replace break point with the next greater element and reverse
        for(int i=n-1;i>0;i--)
        {
            if(nums[i]>nums[brk])
            {
                int temp = nums[brk];
                nums[brk] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        reverse(nums,brk+1,n-1);
        
    }
    void reverse(int nums[],int start,int end)
    {
        while(start<end)
        {
            int temp = nums[start];
            nums[start] =nums[end];
            nums[end] = temp;
            start++;
            end--;

        }
    }
}