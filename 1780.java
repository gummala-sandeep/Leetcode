//1 st approach

class Solution {
    public boolean checkPowersOfThree(int n) {
        if(n==0){ return false;}
        int[] power_3 = {1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147, 531441,1594323, 4782969};
        for(int i=14;i>=0;i--){
            if(n>power_3[i]){
                n-=power_3[i];
            }
            else if(n==power_3[i]){
                return true;
            }
        }
        return false;
    }
}

//2 nd approach

class Solution {
    public boolean checkPowersOfThree(int n) {
        if(n==1)
            return true;
        else if(n%3==0)
            return checkPowersOfThree(n/3);
        else if((n-1)%3==0)
            return checkPowersOfThree((n-1)/3);
        return false;
    }
}
