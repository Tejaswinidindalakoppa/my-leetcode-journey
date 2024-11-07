import java.util.HashMap;
import java.util.Objects;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hashMap = new HashMap<>();
        int i = 0;

        String[] arr = s.split(" ");

        if (arr.length != pattern.length())
            return false;

        for (char ch : pattern.toCharArray()) {
            if (hashMap.containsKey(ch)) {
                if (!Objects.equals(hashMap.get(ch), arr[i])) {
                    return false;
                }
            } else {
                // check if another character already maps to this word
                if (hashMap.containsValue(arr[i])) {
                    return false;
                }
                hashMap.put(ch, arr[i]);
            }
            i++;
        }

        return true;
    }

    public static void main(String[] args) {
        WordPattern solution = new WordPattern();
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(solution.wordPattern(pattern, s)); // Expected output: true
    }
}
