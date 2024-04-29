class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int k = needle.length();
        if(n<k)
        {
            return -1;
        }
        for(int i=0;i<=n-k;i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                String substr = haystack.substring(i,i+k);
                if(substr.equals(needle))
                {
                    return i;
                }
            }
           
        }
        return -1;
    } 
}