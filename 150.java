class Solution {
    public int evalRPN(String[] tokens) {
        int k=0;
        Stack<Integer> s=new Stack<>();
        for(String s1:tokens){
            switch(s1){

                case "+":
                k=s.pop();
                s.push(s.pop()+k);
                break;
                case "*":
                k=s.pop();
                s.push(s.pop()*k);
                break;
                case "-":
                k=s.pop();
                s.push(s.pop()-k);
                break;
                case "/":
                k=s.pop();
                s.push(s.pop()/k);
                break;
                default : 
                s.push(Integer.parseInt(s1));
                break;
            }
        }
        
        return s.pop();
    }
}
