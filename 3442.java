class Solution {
    public int maxDifference(String s) {
        int[] alp=new int[26];
        int min=s.length(),max=0;
        for(char c:s.toCharArray()){
            alp[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(alp[i]>0){
                if(alp[i]%2==0){
                min=Math.min(min,alp[i]);
            }
            else{
                max=Math.max(max,alp[i]);
            }
            }
        }
        return max-min;
    }
}
