class ATM {
    public long[] noofnotes=new long[5];
    public int[] notes;
    public ATM() {
        notes=new int[]{20,50,100,200,500};
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i=0;i<5;i++){
            noofnotes[i]+=banknotesCount[i];
        }
    }
    
    public int[] withdraw(int amount) {
        int[] res=new int[5];
        for(int i=4;i>=0;i--){
            if(amount >= notes[i] ){                                              
				int quantity = (int) Math.min(noofnotes[i], amount / notes[i]);      
				amount -= notes[i] * quantity;                                 
				res[i] = quantity;
			}
        }
        if(amount!=0){return new int[]{-1};}
        for(int i=0;i<5;i++){
            noofnotes[i]-=res[i];
        }
        return res;
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */
