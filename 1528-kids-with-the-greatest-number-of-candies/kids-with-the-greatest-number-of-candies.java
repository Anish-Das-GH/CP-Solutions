class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extracandies) {
        List<Boolean>list=new ArrayList<>();
        int big = candies[0];
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>big)
            {
                big=candies[i];
            }
        }
        
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extracandies>=big)
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }
        return list;
    }
}