//26 march 2025

class Solution {
    public int countDays(int days, int[][] meetings) {
        
        int rest=0,n=meetings.length,max=0;
        if(n==1){
            return (days- meetings[0][1])+(meetings[0][0]-1);
        }
        Arrays.sort(meetings,(a,b)->a[0]-b[0]);

        for(int i=1;i<n;i++){
            max=Math.max(max,meetings[i-1][1]);
           if(meetings[i][0]>meetings[i-1][1]&&meetings[i][0]>max){
             rest+=(meetings[i][0]-max-1);
           }
        }
        max=Math.max(max,meetings[n-1][1]);
        rest+=(meetings[0][0]-1);
        rest+=(days-max);
        return rest;
    }

}
