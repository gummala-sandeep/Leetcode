sansjahklndch 


class Solution {
    public int numberOfSubstrings(String s) {
     char[] ch=s.toCharArray();
     int n=s.length(),count=0;
     int[] freq=new int[3];
     int k=0;
     for(int i=0;i<n;i++){
        freq[ch[i]-'a']++;
        while((freq[0]>0&&k<i)&&(freq[1]>0&&freq[2]>0)){
            count+=n-i;
            freq[ch[k]-'a']--;
            k++;
        }
     }  
     return count; 
    }
}
