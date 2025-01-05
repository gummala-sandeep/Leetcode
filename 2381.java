class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        char[] str = s.toCharArray();
        int n = s.length();
        int[] res = new int[n];
        
        for (int i = 0; i < shifts.length; i++) {
            int l = shifts[i][0], r = shifts[i][1], direction = shifts[i][2];
            if (direction == 1) {
                res[l] += 1;  
                if (r + 1 < n) {
                    res[r + 1] -= 1; 
                }
            } else {
                res[l] -= 1;  
                if (r + 1 < n) {
                    res[r + 1] += 1; 
                }
            }
        }
        int cumulativeShift = 0;
        StringBuilder str2 = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            cumulativeShift += res[i];
            int k = str[i] + cumulativeShift;
            while (k < 'a') {
                k += 26;
            }
            while (k > 'z') {
                k -= 26;
            }
            str2.append((char) k); 
        }
        
        return str2.toString();
    }
}
