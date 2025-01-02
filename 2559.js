class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));       
        int[] arr=new int[words.length+1];
        int[] result=new int[queries.length];
        for(int i=1;i<=words.length;i++){
            if(vowels.contains(words[i-1].charAt(0)) && vowels.contains(words[i-1].charAt(words[i-1].length()-1))){
                arr[i]=arr[i-1]+1;
            }
            else{
                arr[i]+=arr[i-1];
            }
        }
        for(int i=0;i<queries.length;i++){
            result[i]=arr[(queries[i][1])+1]-arr[queries[i][0]];
        }
        return result;        
    }
}
