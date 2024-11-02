import java.util.HashMap;
import java.util.Map;

class RomanToInteger {
    public int romanToInt(String s) {
        int res = 0;
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                res -= roman.get(s.charAt(i)); // Subtract if current value is less than the next
            } else {
                res += roman.get(s.charAt(i)); // Add otherwise
            }
        }

        return res + roman.get(s.charAt(s.length() - 1)); // Add the last character's value
    }

    public static void main(String[] args) {
        RomanToInteger solution = new RomanToInteger();

        // Sample input
        String romanNumeral = "MCMXCIV"; // Example Roman numeral

        // Call the romanToInt method
        int result = solution.romanToInt(romanNumeral);

        // Print the result
        System.out.println("Integer value: " + result);
    }
}
