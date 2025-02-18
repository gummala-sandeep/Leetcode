class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int res=0;
        for(String s:commands){
            if(s.equals("UP"))
                res-=n;
            else if(s.equals("RIGHT"))
                res+=1;
            else if(s.equals("DOWN"))
                res+=n;
            else
                res-=1;
        }        
        return res;
    }
}
