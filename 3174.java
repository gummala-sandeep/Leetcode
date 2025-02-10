class Solution {
    public String clearDigits(String s) {
        String n="1234567890",res="";
        int len=s.length();
        char[] S=s.toCharArray();
        boolean[] k=new boolean[len];
        Arrays.fill(k,false);
        for(int i=0;i<len;i++){
            if(n.indexOf(S[i])==-1){
                k[i]=true;
            }
            else{
                for(int j=i;j>=0;j--){
                    if(k[j]){
                        k[j]=false;
                        break;
                    }
                }
            }
        }
        for(int i=0;i<len;i++){
            if(k[i]){
                res+=S[i];
            }
        }
        return res;
    }
}


//second approach
class Solution {
    public String clearDigits(String s) {
        String r="";
        Stack<Character> res=new Stack<>();
        for(char c:s.toCharArray()){
            if(c>='a'&&c<='z'){                
                res.push(c);
            }
            else{
                res.pop();
            }
        }
        while(!res.isEmpty()){
            r+=res.pop();
        }
        StringBuilder re=new StringBuilder(r);
        return re.reverse().toString();
    }
}
