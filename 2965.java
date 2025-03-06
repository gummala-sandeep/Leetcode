//1 st approach


class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int sum=0,k=n*n;
        int[] arr=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(map.getOrDefault(grid[i][j],0)==1){
                    arr[0]=grid[i][j];
                }
                else{
                    map.put(grid[i][j],1);
                    sum+=grid[i][j];
                }
            }
        }
        arr[1]=((k*(k+1))/2)-sum;
        return arr;
    }
}
