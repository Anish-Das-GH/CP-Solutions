class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int right =0;
        int max =0;
        Set<Character> set = new HashSet<>();
        while(right<s.length())
        {
            char c = s.charAt(right);
            if(!set.contains(c))
            {
                set.add(c);
                right++;
                max=Math.max(max,set.size());
            }
            else
            {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}