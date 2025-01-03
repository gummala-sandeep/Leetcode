class Solution {
    public int reverse(int x) {
        int count=0,n=x;
        long rev=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        while(x!=0){
            rev+=(x%10*Math.pow(10,count-1));
            count--;
            x=x/10;
        }
        return (rev-Math.pow(2,31)>0||rev+Math.pow(2,31)<0)?0:(int)rev;
    }
}
