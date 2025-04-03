class Sample{
    /*********************PROBLEM-1*****************/
    //using max heap
    //TC:0(NlogN)
//SC:0(N)
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            if(nums==null || nums.length==0){
                return 0;
            }
            PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
            for(int each:nums){
                heap.add(each);
            }
            int i=1;
            while(i<k){
                heap.poll();
                i++;
            }
            return heap.poll();
        }
    }
//using min heap
    //TC:0(Nlogk)
//SC:0(N)
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            if(nums==null || nums.length==0){
                return 0;
            }
            PriorityQueue<Integer> heap=new PriorityQueue<>();
            for(int each:nums){
                heap.add(each);
                if(heap.size()>k){
                    heap.remove();
                }
            }

            return heap.peek();
        }
    }
}