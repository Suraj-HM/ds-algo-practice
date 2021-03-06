class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        int len = 0;
        for(int i = 0; i < s.length(); i++) {
            int l = i, r = i;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if(r - l + 1 > len) {
                    res = s.substring(l, r+1);
                    len = r - l + 1;
                }
                l--; r++;
            }
            
            l = i; r = i + 1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if(r - l + 1 > len) {
                    res = s.substring(l, r+1);
                    len = r - l + 1;
                }
                l--; r++;
            }
        }
        return res;
    }
}