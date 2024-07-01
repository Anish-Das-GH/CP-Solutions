class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> stack = new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
        if(stack.isEmpty())
        {
            stack.push(s.charAt(i));
        }
        else
        {
            if(stack.peek()==s.charAt(i))
            {
                stack.pop();
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }

        }

        String ans = new String("");
        while(!stack.isEmpty())
        {
            ans = stack.pop()+ans;
        }
        return ans;
        
    }
}