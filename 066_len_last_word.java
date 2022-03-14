class Solution {
    public int lengthOfLastWord(String s) {
        boolean flag = false;
        int count = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) != ' ') {
                flag = true;
                count++;
            } else if(flag) {
                return count;
            }
        }
        return count;
    }
}