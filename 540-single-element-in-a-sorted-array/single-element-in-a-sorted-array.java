class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right)
        {
            int mid=(left+right)/2;
            if(nums[mid]==nums[mid+1])
            {
                mid-=1;
            }
            int leftlength = mid-left+1;
            if(leftlength%2!=0)
            {
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return nums[left];

    }
}