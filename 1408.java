class Solution {
    public List<String> stringMatching(String[] words) {
        int count;
        List<String> s=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            count=0;
            for(int j=0;j<words.length;j++){
                if(words[j].contains(words[i]))
                    count++;
            }
            if(count>1){
                s.add(words[i]);
            }
        }
        return s;
    }
}
