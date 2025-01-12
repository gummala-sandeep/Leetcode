class Solution {
    public boolean canConstruct(String s, int k) {
        int[] chs=new int[256];
        int C=0;
        if(s.length()<k){
            return false;
        }
        for(char c:s.toCharArray()){
            chs[c-'a']++;
        }
        for(int i=0;i<256;i++){
            if(chs[i]%2==1){
                C++;
            }
        }
        return C<=k;
    }
}

