class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;

        // Skip trailing spaces
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }

        int start = end;
        // Find the start of the last word
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }

        return end - start; // Return the length of the last word
    }

    public static void main(String[] args) {
        LengthOfLastWord solution = new LengthOfLastWord();

        // Sample input
        String input = "Hello World "; // Example input with trailing space

        // Call the lengthOfLastWord method
        int result = solution.lengthOfLastWord(input);

        // Print the result
        System.out.println("Length of last word: " + result);
    }
}
