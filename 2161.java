class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int less=0,high=0,eq=0,k=0;
        int[] res=new int[nums.length];
        for(int i:nums){
            if(i<pivot){
                less++;
            }
            else if(i==pivot){
                eq++;
            }
        }
        high=less+eq;
        for(int i:nums){
            if(i<pivot){
                res[k++]=i;
            }
            else if(i>pivot){
                res[high++]=i;
            }
            else{
                res[less++]=i;
            }
        }
        return res;
    }
}
