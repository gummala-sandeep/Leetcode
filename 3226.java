class Solution {
    public int minChanges(int n, int k) {
        int count=0;
        if(n==k){ return 0;}
        if(n<k){ return -1;}
        if((n&k)==k){
            String s=Integer.toBinaryString(n^k);
            for(char c:s.toCharArray()){
                if(c=='1'){ count++;}
            }
            return count;
        }
        return -1;
    }
}
