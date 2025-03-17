class Solution {
    public long repairCars(int[] ranks, int cars) {
        long high,low;
        int max=ranks[0];
        long ans=0;
        for(int i:ranks)
        {
            max=Math.max(max,i);
        }
        low=0;
        high=max*(long)Math.pow(cars,2);
        while(low<=high){
            long n=0;
            long mid=low+(high-low)/2;
            for(int i:ranks){
                 
                n+=Math.sqrt(mid/i);
                if(n>=cars){ 
                    ans=mid;
                    high=mid-1;
                    break;}
            }
            if(n<cars){ low=mid+1;}
        }
        return ans;
    }
}
