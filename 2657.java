class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        boolean[] b=new boolean[n+1];
        int[] C=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(b[A[i]])
                count++;
            else
                b[A[i]]=true;
            if(b[B[i]])
                count++;
            else
                b[B[i]]=true;
            C[i]=count;
        }
        return C;
    }
}
