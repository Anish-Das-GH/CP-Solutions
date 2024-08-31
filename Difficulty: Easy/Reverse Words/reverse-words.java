//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        
        StringBuilder sb=new StringBuilder();
        String s[] = S.split("\\.");
        for(int i=s.length-1;i>=0;i--)
        {
             if(s[i].length()==0)
             {
             continue;
             }
            if(sb.length()==0)
            {
                sb.append(s[i]);
            }
            else
            {
                sb.append(".");
                sb.append(s[i]);
            }
        }
        return sb.toString();
    }
}