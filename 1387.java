class Solution {
    public int getKth(int lo, int hi, int k) {
        int[] res=new int[hi-lo+1];
        int[] ind=new int[hi-lo+1];
        int count,m=0,n=0,l=0,temp;
        for(int i=lo;i<=hi;i++){
            n=i;
            count=0;
            while(n!=1){
                n=(n%2==0)?n/2:(n*3)+1;
                count++;
            }
            ind[l++]=m;
            res[m++]=count;
        }
        for(int i=0;i<m-1;i++){
            for(int j=0;j<m-i-1;j++){
                if(res[ind[j]]>res[ind[j+1]]){
                    temp=ind[j];
                    ind[j]=ind[j+1];
                    ind[j+1]=temp;
                }
            }
        }
        return ind[k-1]+lo;
    }
}
