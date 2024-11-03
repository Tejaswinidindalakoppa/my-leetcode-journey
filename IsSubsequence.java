public class IsSubsequence {
    /**
     * Checks if 's' is a subsequence of 't'.
     * 
     * @param s The subsequence string to check.
     * @param t The main string to check against.
     * @return true if 's' is a subsequence of 't', false otherwise.
     */
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        // Loop through both strings to check if 's' can be formed from 't'
        while (i < s.length() && j < t.length()) {
            // If characters match, move to the next character in 's'
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            // Always move to the next character in 't'
            j++;
        }

        // If we've moved through all characters in 's', it's a subsequence
        return i == s.length();
    }

    // Main method for testing
    public static void main(String[] args) {
        IsSubsequence checker = new IsSubsequence();
        String s = "abc";
        String t = "ahbgdc";

        System.out.println("Is '" + s + "' a subsequence of '" + t + "'? " + checker.isSubsequence(s, t));
    }
}
