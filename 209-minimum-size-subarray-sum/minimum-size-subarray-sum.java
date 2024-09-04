class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       
        int left = 0; 
        int right = 0; 
        int minLength = Integer.MAX_VALUE;
        boolean existingSolution = false;

        int curSum = 0;
        while (right < nums.length)
        {
           
            curSum += nums[right];
            while (curSum >= target)
            {
                existingSolution = true;
                
                if (((right - left) + 1) < minLength)
                {
                    minLength = right - left + 1;
                }
                curSum -= nums[left];
                left++;
            }
            right++;
        }

        if (!existingSolution)
        {
            return 0;
        }

        return minLength;
    }
}