class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String result = "";
        for (String word : words) {
            String reverseWord = "";
            for(int i = word.length() - 1; i >= 0; i--) {
                reverseWord += word.charAt(i);
            }
            result += reverseWord + " ";
        }
        return result.trim();
    }
}