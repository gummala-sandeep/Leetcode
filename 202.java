class Solution {
    public boolean isHappy(int n) {
        int k=0,rem=0,ans;
        if(n==1||n==7){return true;}
        while(n>9){
            ans=0;
            k=n;
            while(k!=0){
                rem=k%10;
                ans+=Math.pow(rem,2);
                k=k/10;
            }
            n=ans;
        }
        System.out.println(n);
        return (n==1||n==7)?true:false;
    }
}
