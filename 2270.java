//3rd january 2025

class Solution {
    public int waysToSplitArray(int[] nums) {
    long sum=0,count=0,res=0,numsSize=nums.length;
    for(int i=0;i<numsSize;i++){
        sum+=nums[i];
    }
    for(int j=0;j<numsSize-1;j++){
        res+=nums[j];
        if(res>=sum-res){
            count++;
        }       
    }
    return (int)count;
    }
}
