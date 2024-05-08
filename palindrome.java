class Solution {
    public boolean isPalindrome(int x) {
    
        if (x < 0) 
        return false;

        int original = x, reversed = 0;
        // Reverse the number mathematically
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        // Compare the original and reversed numbers
        return original == reversed;
    }
}
