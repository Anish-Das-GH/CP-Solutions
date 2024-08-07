class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] r =  ransomNote.toCharArray();
        char[] m = magazine.toCharArray();

        Arrays.sort(r);
        Arrays.sort(m);

        int rp = 0;
        int mp = 0;
        while(mp<magazine.length())
        {
            if(r[rp]==m[mp])
            {
                rp++;
            }
            if(rp==r.length)
            {
                return true;
                
            }
            mp++;

        }
        return false;
    }
}