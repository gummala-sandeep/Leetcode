class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:nums){
            if(i<k){
                pq.add(i);
            }
        }
        int count=0;
        long m=0;
        while(!pq.isEmpty()){
            int x=pq.poll();
            count++;
            if(pq.isEmpty()) break;
            int y=pq.poll();
            m=2L*x+y;
            if(m<k) pq.add((int)m);

        }
        return count;
    }
}
