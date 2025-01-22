class Solution {
    public int removeDuplicates(int[] nums) {
        int[] res=new int[nums.length];
        int j,i=0,k=0;
        while(i<nums.length){
            j=i;
            res[k]=nums[i];
            while(j<nums.length&&nums[j]==nums[i]){
                j++;
            }
            i=j;
            k++;
        }
        for(int m=0;m<nums.length;m++){
            nums[m]=res[m];
        }
        return k;
    }
}
