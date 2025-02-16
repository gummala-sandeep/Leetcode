class Solution {
    public String getSmallestString(String s){
        int k=0;
        String res="";
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length()-1;i++){
            if(ch[i]>ch[i+1]&&(ch[i]-ch[i+1])%2==0){
                char temp=ch[i];
                ch[i]=ch[i+1];
                ch[i+1]=temp;
                break;
            }
        }
        return new String(ch);
    }
}
