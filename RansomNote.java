import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magaHash = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            magaHash.put(c, magaHash.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!magaHash.containsKey(c) || magaHash.get(c) <= 0) {
                return false;
            }
            magaHash.put(c, magaHash.get(c) - 1);
        }

        return true;
    }

    // Main method to test the code
    public static void main(String[] args) {
        RansomNote solution = new RansomNote();
        
        // Test cases
        String ransomNote1 = "a";
        String magazine1 = "b";
        System.out.println("Can construct (Test 1): " + solution.canConstruct(ransomNote1, magazine1)); // Expected: false

        String ransomNote2 = "aa";
        String magazine2 = "ab";
        System.out.println("Can construct (Test 2): " + solution.canConstruct(ransomNote2, magazine2)); // Expected: false

        String ransomNote3 = "aa";
        String magazine3 = "aab";
        System.out.println("Can construct (Test 3): " + solution.canConstruct(ransomNote3, magazine3)); // Expected: true
    }
}
