//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}

// } Driver Code Ends



class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<S.length();i++)
        {
            if(map.containsKey(S.charAt(i)))
            {
                map.put(S.charAt(i),map.get(S.charAt(i))+1);
            }
            else
            {
                map.put(S.charAt(i),1);
            }
        }
        
        for(int i=0;i<S.length();i++)
        {
            if(map.get(S.charAt(i))==1)
            {
                return S.charAt(i);
            }
        }
        return '$';
    }
}

