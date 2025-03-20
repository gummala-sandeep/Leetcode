//14th march 2025


class Solution {
    public int maximumCandies(int[] candies, long k) {
        int avg=0,n=candies.length,low=1,high=0,ans=0;
        long sum=0;
        for(int i:candies){
            sum+=i;
            high=Math.max(high,i);
         }
        if(sum<k){ return 0;}
        low=1;
        while(low<=high){
            int mid=(low+high)/2;
            long count=0;
            for(int i:candies)
                count+=i/mid;
            if(count>=k){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1; 
            }
        }
        return ans;
    }
}
