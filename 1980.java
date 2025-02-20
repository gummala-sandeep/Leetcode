class Solution {
    public String findDifferentBinaryString(String[] nums) {
        String binary,res;
        int k=0;
        for(int i=0;i<Math.pow(2,nums.length)-1;i++){
            res="";
            binary=Integer.toBinaryString(i);
            k=binary.length();
            while(k!=nums.length){
                res+="0";
                k++;
            }
            res+=binary;
            if(Arrays.asList(nums).indexOf(res)==-1){
                return res;
            }
        }
        return (nums[0].equals("0"))?"1":"0";
    }
}
