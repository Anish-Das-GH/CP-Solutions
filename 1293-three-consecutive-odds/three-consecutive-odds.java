class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int flag=0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                flag++;
            if(flag==3)
            {
             return true;
            }
            }
            
            else{
            flag=0;
            }

        }
        
        return false;
    }
}