class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){return true;}
        if(n<1){return false;}
        if(n%10==4||n%10==6){
            while(n!=4){
                if(n%4==0){
                    n=n/4;
                }
                else{
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
