class Solution {
    public int findKthLargest(int[] nums, int k) {
    //     int i;
    //     int size = nums.length;
    //     PriorityQueue <Integer> heap = new PriorityQueue<Integer>(Collections.reverseOrder());
    //     for(i=0;i<size;i++)
    //     {
    //         heap.add(nums[i]);

    //     }

    //     for(i=1;i<k;i++)
    //     {
    //         heap.poll();
    //     }
    //     return heap.peek();
    Arrays.sort(nums);
    return nums[nums.length - k];
    }
}