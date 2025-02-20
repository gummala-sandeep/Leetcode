class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[] c=new int[26];
        for(char k:s.toCharArray())
            c[k-'a']++;
        for(char k:t.toCharArray())
            c[k-'a']--;
        for(int i:c){
            if(i!=0)
                return false;
        }
        return true;
    }
}
