class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length();
        while(n%k!=0){
            s+=fill;
            n++;
        }
        String[]  arr=new String[n/k];
        int i=0,m=0;
        while(i!=n){
            arr[m++]=s.substring(i,i+k);
            i+=k;
        }
        return arr;
    }
}
