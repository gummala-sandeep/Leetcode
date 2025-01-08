class Solution {
    
    public int countPrefixSuffixPairs(String[] words) {
        int count=0,n=0,m=0;
        for(int i=1;i<words.length;i++){
            for(int j=0;j<i;j++){
                n=words[i].length();
                m=words[j].length();
                if(n>=m&&(words[i].substring(0,m).equals(words[j])&&words[i].substring(n-m).equals(words[j]))){
                    count++;
                }

            }
        }
        return count;
    }
}
