class Solution {
    public int maximumCount(int[] nums) {
        int neg=0;
        int n=nums.length,i;
        for(i=0;i<n;i++){
            if(nums[i]<0){
                neg++;
            }
            if(nums[i]>0){ break;}
        }
        return Math.max(neg,n-i);
    }
}
