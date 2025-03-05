//1 st approach


class Solution {
    public long coloredCells(int n) {
        if(n==1){return n;}
        long res=(long)Math.pow(n,2)+(long)Math.pow(n-1,2);
        return res;
    }
}


//2 nd approach
class Solution {
    public long coloredCells(int n) {
        long res=1;
        for(int i=2;i<=n;i++)
        {
            res+=(4*(i-1));
        }
        return res;
    }
}
