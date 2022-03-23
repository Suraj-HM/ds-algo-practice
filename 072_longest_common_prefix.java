class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        boolean breakflag = false;
        for(int i = 0; i < strs[0].length(); i++) {
            char prev = strs[0].charAt(i);
            for(int j = 0; j < strs.length; j++) {
                if(i >= strs[j].length() || strs[j].charAt(i) != prev) {
                    breakflag = true;
                    break;
                }
            }
            if(breakflag) break;
            res += prev;
        }
        return res;
    }
}