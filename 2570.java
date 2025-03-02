//approach 1

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int max=0,k=0;
       for(int i=0;i<nums1.length;i++){
            if(!map.containsKey(nums1[i][0])){
                map.put(nums1[i][0],nums1[i][1]);
            }
            else{
                map.put(nums1[i][0],map.get(nums1[i][0])+nums1[i][1]);
            }
            max=Math.max(max,nums1[i][0]);
       }
       for(int i=0;i<nums2.length;i++){
            if(!map.containsKey(nums2[i][0])){
                map.put(nums2[i][0],nums2[i][1]);
            }
            else{
                map.put(nums2[i][0],map.get(nums2[i][0])+nums2[i][1]);
            }
            max=Math.max(max,nums2[i][0]);
       }
       int[][] res=new int[map.size()][2];
       for(int i=1;i<=max;i++){
            if(map.containsKey(i)){
                res[k][0]=i;
                res[k++][1]=map.get(i);
            }
       }
       return res;

    }
}


//2 approach


class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        ArrayList<int []> li=new ArrayList<>();
        int i=0,j=0,m=nums1.length,n=nums2.length;
        while(i<m&&j<n){
            int[] k=new int[2];
            if(nums1[i][0]<nums2[j][0]){
               k[0]=nums1[i][0];
               k[1]=nums1[i++][1];
            }
             else if(nums1[i][0]>nums2[j][0]){
                k[0]=nums2[j][0];
                k[1]=nums2[j++][1];
            }
            else if(nums1[i][0]==nums2[j][0]){
                k[0]=nums1[i][0];
                k[1]=nums1[i++][1]+nums2[j++][1];
            }
            li.add(k);
        }
        while(i<m){
            li.add(nums1[i++]);
        }
        while(j<n){
            li.add(nums2[j++]);
        }
        return li.toArray(int[][]:: new);
    }
}
