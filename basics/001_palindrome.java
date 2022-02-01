package basics;

class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int newNum = 0;
        while (x > 0) {
            newNum = newNum * 10;
            newNum = newNum + x % 10;
            x = x / 10;
        }
        if (temp == newNum) {
            return true;
        }
        return false;
    }
}