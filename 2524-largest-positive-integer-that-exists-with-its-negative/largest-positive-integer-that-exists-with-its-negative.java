class Solution {
    public int findMaxK(int[] nums) {
       int maxi=-1;
       HashSet <Integer> set = new HashSet<>();
       for(int i=0;i<nums.length;i++)
       {
          set.add(nums[i]);
       }
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]>0 && set.contains(-nums[i]))
         {
            maxi = Math.max(maxi,nums[i]);
         }
       }
       return maxi;
    }
}