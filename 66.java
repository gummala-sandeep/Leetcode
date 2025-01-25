class Solution {
    public int[] plusOne(int[] digits) {
        int count=0;
        for(int i:digits){
            if(i==9){
                count++;
            }
            else{
                break;
            }
        }
        if(count==digits.length){
            int[] res=new int[digits.length+1];
            res[0]=1;
            return res;
        }
        else{
            int n=digits.length,i=0;
            if(digits[n-1]==9){
                while(digits[n-i-1]==9){
                    digits[n-i-1]=0;
                    i++;
                }
                digits[n-i-1]++;
            }
            else{
                digits[n-1]++;
            }
            return digits;
        }
    }
}
