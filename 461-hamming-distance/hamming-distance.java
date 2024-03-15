class Solution {
    public int hammingDistance(int x, int y) {
        int ans= x ^ y;
        int[] binaryNum = new int[1000]; 
   
        // counter for binary array 
        int i = 0; 
        while (ans > 0)  
        { 
            // storing remainder in binary array 
            binaryNum[i] = ans % 2; 
            ans = ans / 2; 
            i++; 
        } 
        int c=0;
        for( int m: binaryNum){
            if(m == 1) c++;
        }
    return c;
    }
}