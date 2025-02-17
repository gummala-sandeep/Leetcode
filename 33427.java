class Solution {
    public int subarraySum(int[] nums) {
        int sum=0,ans=0;
        int[] ps=new int[nums.length+1];
        ps[0]=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ps[i+1]=sum;
            ans+=Math.abs(ps[Math.max(0,i-nums[i])]-ps[i+1]);
        }
        return ans;
    }
}
