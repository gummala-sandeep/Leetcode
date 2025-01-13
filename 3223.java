class Solution {
    public int minimumLength(String s) {
        int count=0;
        int[] arr=new int[256];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        for(int n:arr){
            if(n>=3){
                if(n%2==1)
                    count+=n-1;
                else
                    count+=n-2;
            }
        }
        return s.length()-count;
    }

}
