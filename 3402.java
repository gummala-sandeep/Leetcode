class Solution {
    public int minimumOperations(int[][] grid) {
        int sum1=0,sum2=0;
        for(int i=0;i<grid.length-1;i++){
            for(int j=0;j<grid[0].length;j++){
                sum1+=grid[i+1][j];
                grid[i+1][j]=Math.max(grid[i+1][j],grid[i][j]+1);
                sum2+=grid[i+1][j];
            }
        }
        return sum2-sum1;
    }
}
