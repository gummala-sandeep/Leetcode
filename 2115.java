//1st approach

class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        List<String> res=new ArrayList<>();
        boolean bool[] =new boolean[recipes.length];
        Map<String,Integer> map=new HashMap<>();
        for(String s:supplies){
            map.put(s,1);
        }
        int n=recipes.length;
        for(int k=0;k<n;k++){
                    for(int i=0;i<n;i++){
            if(!bool[i]){
                int flag=0;
            for(int j=0;j<ingredients.get(i).size();j++){
                if(!map.containsKey(ingredients.get(i).get(j))){
                    flag=1;
                }
            }
            if(flag==0){ 
                bool[i]=true;
                res.add(recipes[i]);
                map.put(recipes[i],1);
            }
            }
          }
        }
        return res;
    }
}
