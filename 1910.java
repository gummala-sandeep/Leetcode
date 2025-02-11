class Solution {
    public String removeOccurrences(String s, String part) {
        int n=part.length(),m;
        String r="";
        StringBuffer res=new StringBuffer(r);
        for(char c:s.toCharArray()){
            res.append(c);
            m=res.length();
            if(m>=n){
                String d=res.toString().substring(m-n,m);
                if(d.equals(part)){
                    res.delete(m-n,m);
                }
            }
        }
        return res.toString();
    }
}
