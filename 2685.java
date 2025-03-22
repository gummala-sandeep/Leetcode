class Solution {
    public static int sum=0;
    public static int vertices=0;
    public void DFS(int v,boolean[] visited,boolean[][] edgematrix,int n){
        visited[v]=true;
        for(int i=0;i<n;i++){
            if(edgematrix[v][i]){
                edgematrix[i][v]=false;
                sum++;
                if(!visited[i]){
                   vertices++;
                   DFS(i,visited,edgematrix,n);
                }
            }
        }
    } 
    public int countCompleteComponents(int n, int[][] edges) {
        int count=0;
        boolean[][] edgematrix=new boolean[n][n];
        boolean visited[]=new boolean[n];
        for(int i=0;i<edges.length;i++){
            edgematrix[edges[i][0]][edges[i][1]]=true;
            edgematrix[edges[i][1]][edges[i][0]]=true;
        }
        for(int i=0;i<n;i++){
            if(!visited[i]){
                 sum=0;
                 vertices=1;
                DFS(i,visited,edgematrix,n);
                if(sum==((vertices*(vertices-1))/2)){ count++;}
            }
        }
        return count;
    }
}
