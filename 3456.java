class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        int t=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                t++;
            }
            else{
                if(t==k){
                    return true;
                }
                t=1;
            }            
        }
        return (t==k)?true:false;
    }
}
