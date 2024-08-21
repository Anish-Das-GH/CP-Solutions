class Solution {
    public int sumOfUnique(int[] nums) {
       Arrays.sort(nums);
       int sum = 0;
       HashMap <Integer,Integer> map=new HashMap<Integer,Integer>();
       for(int i = 0; i < nums.length; i++) {
           if(map.containsKey(nums[i])) 
           {
            map.put(nums[i],map.get(nums[i])+1);
           }
           else
           {
            map.put(nums[i],1);
           }
       }
       for(int x:nums)
       {
        if(map.get(x)==1)
        {
            sum=sum+x;
        }
       }
       return sum;
    }

}