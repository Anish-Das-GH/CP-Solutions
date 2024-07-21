class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int len = nums.length;
        // int i;
        // for(i=0;i<len;i++)
        // {
        //     map.put(nums[i],i);
        // }

        // for(i=0;i<len;i++)
        // {
        //     int rem = target - nums[i];
        //     if(map.containsKey(rem))
        //     {
        //         int index = map.get(rem);
        //         if(index==i) continue;
        //         return new int[]{i,index};

        //     }
        // }

        // return new int[]{};

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