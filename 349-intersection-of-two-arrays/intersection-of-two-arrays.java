class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //HashSet Method
        // HashSet<Integer> set1 = new HashSet<>();
        // HashSet<Integer> set2 = new HashSet<>();
        // for(int i=0;i<nums1.length;i++)
        // {
        //     set1.add(nums1[i]);
        // }
        // for(int i=0;i<nums2.length;i++){
        //     if(set1.contains(nums2[i]))
        //     {
        //         set2.add(nums2[i]);
        //     }
        // }

        // int[] arr = new int[set2.size()];
        // int i=0;
        // for(int x:set2)
        // {
        //     arr[i]=x;
        //     i++;
        // }

        // return arr;

        //Two Pointer 
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> set = new HashSet<>();
        int i=0;int j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
                set.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
            
        }

        int []res=new int [set.size()];
        int k=0;
        for(int x:set)
        {
            res[k]=x;
            k++;
        }
        return res;
    }
}