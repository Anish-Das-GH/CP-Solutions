class Solution {
    public int findPeakElement(int[] nums) {
        // int n= nums.length;
        // if(n==1) {
        //     return 0;
        // }
        // if(nums[0]>nums[1])
        // {
        //     return 0;
        // }
        // else if(nums[n-1]>nums[n-2])
        // {
        //     return n-1;
        // }
        // int low=1;
        // int high = n-2;
        // int mid;
        // while(low<=high)
        // {
        //     mid = (low+high)/2;
        //     if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
        //     {
        //         return mid;
        //     }
        //     else if(nums[mid]>nums[mid-1])
        //     {
        //         low = mid+1;
        //     }
        //     else
        //     {
        //         high = mid-1;
        //     }
        // }

        // return -1;

     
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = (left + right) / 2;
            if(nums[mid] > nums[mid+1]) right = mid;
            else left = mid + 1;
        }
        return left;

        
    }
}