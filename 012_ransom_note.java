import java.util.HashMap;

class Solution1 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> ransomCount = new HashMap<Character, Integer>();
        HashMap<Character, Integer> magazineCount = new HashMap<Character, Integer>();
        
        char c;
        for(int i = 0; i < ransomNote.length(); i++) {
            c = ransomNote.charAt(i);
            ransomCount.put(c, ransomCount.containsKey(c) ? ransomCount.get(c) + 1 : 1);
        }
        for(int i = 0; i < magazine.length(); i++) {
            c = magazine.charAt(i);
            magazineCount.put(c, magazineCount.containsKey(c) ? magazineCount.get(c) + 1 : 1);
        }
        
        for(char ch : ransomCount.keySet()) {
            if(!magazineCount.containsKey(ch)) return false;
            if(ransomCount.get(ch) > magazineCount.get(ch)) return false;
        }
        return true;
    }
}



class Solution2 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        
        int[] counter = new int[26];
        for(char c : ransomNote.toCharArray()) counter[c - 'a']++;
        for(char c : magazine.toCharArray()) counter[c - 'a']--;
        
        for(int i : counter) if(i > 0) return false;
        
        return true;
    }
}