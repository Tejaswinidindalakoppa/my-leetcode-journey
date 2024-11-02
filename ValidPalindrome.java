class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true; // An empty string is considered a palindrome
        }
        int start = 0;
        int last = s.length() - 1;

        // Check characters from both ends towards the center
        while (start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst)) {
                start++; // Move forward if not a letter or digit
            } else if (!Character.isLetterOrDigit(currLast)) {
                last--; // Move backward if not a letter or digit
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false; // Not a palindrome
                }
                start++;
                last--;
            }
        }
        return true; // Is a palindrome
    }

    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();

        // Sample input
        String input = "A man, a plan, a canal: Panama"; // Example input

        // Call the isPalindrome method
        boolean result = solution.isPalindrome(input);

        // Print the result
        System.out.println("Is palindrome: " + result);
    }
}
