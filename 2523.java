class Solution {
    public boolean isprime(int n){

        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> li=new ArrayList<>();
        int[] arr ={-1,-1};
        int min=right-left;
        if(left<=2&&right>2) { return new int[]{2,3};}
        left=(left%2==0)?left+1:left;
        for(int i=left;i<=right;i+=2){
             if(i%5!=0&&i!=1){
                if(isprime(i)){
                    li.add(i);
                }            
              }
        }
        for(int i=li.size()-1;i>0;i--){
            if((li.get(i)-li.get(i-1))<=min){
                min=li.get(i)-li.get(i-1);               
                arr[1]=li.get(i);
                arr[0]=li.get(i-1);
            }
        }
        return arr;
    }
}
