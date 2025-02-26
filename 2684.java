class Solution {
    public int[] circularGameLosers(int n, int k) {
        if(n==1){ return new int[]{};}
        boolean[] arr=new boolean[n+1];
        int i=1,t=1,count=1,m=0;
        arr[1]=true;
        while(true){
            i+=t*k;
            if(arr[i%n]==true){break;}
            arr[i%n]=true;
            count++;
            t++;
        }
        int[] res=new int[n-count];
        for(int j=1;j<n;j++){
            if(!arr[j]){
                res[m]=j;
                m++;
            }
        }
        if(!arr[0]){res[m]=n;}
        return res;
    }
}
