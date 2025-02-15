class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0,high=nums.length-1,mid,key=0;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target){
                key=mid;
                break;
            }
            else if(nums[mid]>target){
                high=mid-1;
                
            }
            else if(nums[mid]<target){
                low=mid+1;
                key=low;
            }
        }
        return key;
    }
}
