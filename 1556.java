class Solution {
    public String thousandSeparator(int n) {
        StringBuilder res=new StringBuilder(String.valueOf(n));
        for(int i=3;i<res.length();i+=4){
            res.insert(res.length()-i,".");
        }
        return res.toString();
    }
}
