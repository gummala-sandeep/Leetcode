class RecentCounter {
    private int count;
    private ArrayList<Integer> arr; 
    public RecentCounter() {
        arr=new ArrayList<>();
    }
    
    public int ping(int t) {
        arr.add(t);
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>3000-t){
                return arr.size()-t;
            }
        }
        return 0;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
