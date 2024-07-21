class Solution {
    public int[] twoSum(int[] nums, int target) {
        

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
           int sub = target-nums[i];
            if(map.containsKey(sub))
            {
                int arr[]={i,map.get(sub)};
                return arr;
                
            }
            map.put(nums[i], i);
        }
        return new int[]{};


    }
}