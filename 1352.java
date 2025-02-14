class ProductOfNumbers {
    private List<Integer> res;
    private int pro=1;
    private int flag=0;
    public ProductOfNumbers() {
        res=new ArrayList<>();
    }
    
    public void add(int num) {
        if(num==0){
            res.add(num);
            Collections.fill(res,0);
            flag=res.size();
            pro=1;
        }
        else{
            pro*=num;
            res.add(pro);
        }

    }
    
    public int getProduct(int k) {
        if(res.size()-k>=flag){
            if(res.size()-k==flag){
                return res.get(res.size()-1);
            }
            return res.get(res.size()-1)/res.get(res.size()-k-1);
        }
        return 0;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
