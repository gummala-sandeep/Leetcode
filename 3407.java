class Solution {
    public boolean hasMatch(String s, String p) {
        if(p.length()-s.length()>1){return false;}
        System.out.println("hello");
        int n=p.indexOf('*');
        String s1=p.substring(0,n),s2=p.substring(n+1);
        int k=s.indexOf(s1);
        if(k+s1.length()<=s.length()){
            if(s.contains(s1)&&s.substring(k+s1.length()).contains(s2)){
            return true;
        }
        }
        return (p.length()==1||k==s.length()-1)?true:false;
    }
}
