// sliding window bruteforce
class Solution1 {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        
        int[] freq1 = genFreq(s1);
        if(s1.length() == s2.length()) {
            int[] freq2 = genFreq(s2);
            return isValid(freq1, freq2);
        }
        
        int j = s1.length();
        boolean flg = false;
        for(int i = 0; i < s2.length() && j <= s2.length(); i++) {
            int[] freq2 = genFreq(s2.substring(i, j));
            
            if(isValid(freq1, freq2)) {
                flg = true;
                break;
            }
            j++;
        }
        return flg;
    }
    
    private boolean isValid(int[] freq1, int[] freq2) {
        for(int i = 0; i < 26; i++) {
            if(freq1[i] != freq2[i]) return false;
        }
        return true;
    }
    
    private int[] genFreq(String s) {
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        return freq;
    }
    
}



// sliding window optimized
class Solution2 {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2) return false;
        
        int[] count = new int[26];
        for (int i = 0; i < len1; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        if (allZero(count)) return true;
        
        for (int i = len1; i < len2; i++) {
            count[s2.charAt(i) - 'a']--;
            count[s2.charAt(i - len1) - 'a']++;
            if (allZero(count)) return true;
        }
        
        return false;
    }
    
    private boolean allZero(int[] count) {
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }
        return true;
    }
}

