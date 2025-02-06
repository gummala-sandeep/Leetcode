//1st febraury 2025

class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0],max=0,n=prices.length;
        for(int i=1;i<n;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else if(prices[i]-min>max){
                max=prices[i]-min;
            }
        }
        return max;
    }
}
