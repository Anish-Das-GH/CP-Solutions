class Solution {
    public boolean isPalindrome(String s) {
        
        String ans = "";
        String ans2 = "";
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
             if(s.charAt(i)>='a' && s.charAt(i)<='z')
             {
                ans = ans + s.charAt(i);
             }
             else if(s.charAt(i)>='0' && s.charAt(i)<='9')
             {
                ans = ans + s.charAt(i);
             }
        }
        int size = ans.length();

        // for(int i =size-1;i>=0;i--)
        // {
        //     ans2 = ans.charAt(i) + ans2;
        // }

for(int i = 0; i < ans.length();i++){

            ans2 = ans.charAt(i) + ans2;
        }
        
        if(ans.equals(ans2))
        {
            return true;
        }
        return false;
}
}