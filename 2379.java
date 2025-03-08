class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minsteps=Integer.MAX_VALUE;
        int n=blocks.length();
        int count;
        String str="";
        for(int i=0;i<k;i++){
            str+="B";
        }
        if(blocks.contains(str)){return 0;}
        for(int i=0;i<n-k+1;i++){
            count=0;
            for(int j=i;j<i+k;j++){
                // if(j>=n){break;}
                if(blocks.charAt(j)=='W'){
                    count++;
                }
            }
            minsteps=Math.min(minsteps,count);
        }
        return minsteps;
    }
}
