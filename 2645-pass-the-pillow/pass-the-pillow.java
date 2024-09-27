class Solution {
    public int passThePillow(int n, int time) {
        if(n>time) return time+1;
        else{
            int p=n-1;
            int t1=time/p;
            int t2=time%p;
            if(t1%2==0)return t2+1;
            else return n-t2;
        }
        
    }
}