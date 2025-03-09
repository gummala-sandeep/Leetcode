class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
            int n=colors.length,count=0,w=0;
            for(int i=0;i<n+k-1;i++){
                if(colors[i%n]==colors[(i+1)%n]){
                    w=1;
                }
                else{
                    w++;
                }
                if(w>=k){
                    count++;
                }
            }
            return count;
    }
}
