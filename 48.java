class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int[][] res=new int[n][n];
        int k;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            k=n-1;
            for(int j=0;j<n;j++){
                matrix[i][j]=res[k][i];
                k--;
            }
        }
    }
}
