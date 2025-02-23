class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length,k;
        int[][] res=new int[n][n];
        for(int i=0;i<n;i++){
            k=0;
            for(int j=n-1;j>=0;j--){
                res[i][k]=(image[i][j]==0)?1:0;
                k++;
            }
        }
        return res;
    }
}
