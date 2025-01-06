class Solution {
    public int[] minOperations(String boxes) {
        char[] s=boxes.toCharArray();
        int n=s.length;
        int[] arr=new int[n];
        int k=0,ones=0,sum=0;
        for(int i=0;i<n;i++){
            if(s[i]=='1')
            {
                sum+=i;
                ones++;
            }
        }
        if(s[0]=='1'){
            k++;
            ones--;
        }
        arr[0]=sum;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]-ones+k;
            if(s[i]=='1'){
                k++;
                ones--;
            }
        }
        return arr;
    }
}
