class Solution {
    public boolean check(int[] nums) {
        int pos=0,n=nums.length,k=nums[n-1];
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                pos++;
            }
        }
        return ((pos==1&&nums[0]>=k)||pos==0)?true:false;
    }
}
