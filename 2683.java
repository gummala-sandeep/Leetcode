//17th january 2025


class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int res=0;
        for(int k:derived){
            res=res^k;
        }
        return (res==0)?true:false;
    }
}
