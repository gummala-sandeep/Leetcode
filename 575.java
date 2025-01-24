class Solution {
    public int distributeCandies(int[] candyType) {
         Set<Integer> set = Arrays.stream(candyType).boxed().collect(Collectors.toSet());
         return (set.size()>(candyType.length)/2)?candyType.length/2:set.size();
    }
}
