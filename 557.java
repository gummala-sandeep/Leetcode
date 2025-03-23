
//1st approach

class Solution {
    public String reverseString(String p){
        StringBuilder sc=new StringBuilder(p);
        return (sc.reverse()).toString();
    }
    public String reverseWords(String s) {
        String arr[] =s.split(" ");       
        String res="";
        for(String k:arr){
            res+=(reverseString(k)+" ");
        }
        return res.trim();
    }
}
