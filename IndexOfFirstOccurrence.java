class IndexOfFirstOccurrence {
    public int strStr(String haystack, String needle) {
        // If needle is longer than haystack, return -1
        if (haystack.length() < needle.length()) {
            return -1;
        }
        
        // Iterate through haystack
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Check if the substring from haystack matches the needle
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i; // Return the starting index
            }
        }
        
        return -1; // Return -1 if needle is not found        
    }

    public static void main(String[] args) {
        IndexOfFirstOccurrence solution = new IndexOfFirstOccurrence();

        // Sample input
        String haystack = "sadbutsad"; // Example haystack
        String needle = "sad";         // Example needle

        // Call the strStr method
        int result = solution.strStr(haystack, needle);

        // Print the result
        System.out.println("Index of first occurrence: " + result);
    }
}
