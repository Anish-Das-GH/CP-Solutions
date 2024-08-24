// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         for(int i=0;i<nums.length;i++)
//         {
//             nums[i]=nums[i]*nums[i];
//         }
//         Arrays.sort(nums);
//         return nums;
//     }
// }

class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[]=new int [nums.length];
        int n=nums.length;
        int i=0,j=n-1,k=n-1;
        while(i <= j)
        {
            if(nums[i]*nums[i] > nums[j]*nums[j])
            {
                res[k]=nums[i]*nums[i];
                i++;
            }
            else
            {
                res[k]=nums[j]*nums[j];
                j--;
            }
            k--;
        }
        return res;
    }
}