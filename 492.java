class Solution {
    public int[] constructRectangle(int area) {
        if(area==1){  return new int[]{1,1};}
        int i;
        for( i=(int)Math.sqrt(area);i<=area;i++){
            if(i>=area/i&&area%i==0){
                return new int[]{i,area/i};
            }
        }
        return new int[]{};
    }
}
