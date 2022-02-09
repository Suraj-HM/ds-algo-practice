import java.util.HashMap;

class Solution1 {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> letterCount = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(letterCount.containsKey(c)) {
                letterCount.put(c, letterCount.get(c) + 1);
            } else {
                letterCount.put(c, 1);
            }
        }
        int index = -1;
        for(char c : letterCount.keySet()) {
            if(letterCount.get(c) == 1) {
                index = index == -1 ? s.indexOf(c) : Math.min(s.indexOf(c), index) ;
            }
        }
        return index;
    }
}

class Solution2 {
    public int firstUniqChar(String s) {
        int[] counter = new int[26];
        for(char c : s.toCharArray()) counter[c - 'a']++;
        for(int i = 0; i < s.length(); i++) if(counter[s.charAt(i) - 'a'] == 1) return i;
        return -1;
    }
}