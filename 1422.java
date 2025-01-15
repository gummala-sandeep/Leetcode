//1 january 2025


class Solution {
    public int maxScore(String s) {
        int val=0;
        int[] res=new int[s.length()-1];
        for(int i=0;i<s.length()-1;i++){

            if(val<s.length()){
                 val=0;
                String s1=s.substring(0,i+1);
                String s2=s.substring(i+1);
                 for(int j=0;j<s1.length();j++){
                    if(s1.charAt(j)=='0')
                       val++;
                 }
                 for(int k=0;k<s2.length();k++){
                    if(s2.charAt(k)=='1')
                       val++;
                 }
                 res[i]=val;
            }        
        }
        return Arrays.stream(res).max().getAsInt();
    }
}
