class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n=arr.length,count=0,index,max=0;
        int[] res=new int[n];
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                count=2;
                int a=arr[i],b=arr[j];
                while(true){
                    index=Arrays.binarySearch(arr,a+b);
                    if(index<0){ break;}
                    count++;
                    a=b;
                    b=arr[index];
                    max=Math.max(max,count);
                }
            }
        }
        return max;
    }
}
