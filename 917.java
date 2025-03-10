class Solution {
    public String reverseOnlyLetters(String s) {
         char[] ch=s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j){
            int ascii=(int)Character.toLowerCase(ch[i]);
            int ascii1=(int)Character.toLowerCase(ch[j]);
            if((ascii<123&&ascii>96)&&(ascii1<123&&ascii1>96)){
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
            else{
                if(ascii<123&&ascii>96){
                    j--;
                }
                else{
                    i++;
                }
            }
        }
        String res=new String(ch);
        return res;
    }
}
