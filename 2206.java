class Solution {
    public boolean divideArray(int[] nums) {
        int max=0;
        for(int i:nums){ max=Math.max(max,i);}
        int [] arr=new int[max+1];
        for(int i: nums){ arr[i]++;}
        for(int i:arr){
             if(i%2!=0)
                return false;
        }
        return true;
    }
}
