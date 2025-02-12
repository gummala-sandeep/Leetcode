class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int i=0;
        for(String k:sentence.split(" ")){
            i++;
            if(k.startsWith(searchWord)){
                return i;
            }
        }
        return -1;
    }
}
