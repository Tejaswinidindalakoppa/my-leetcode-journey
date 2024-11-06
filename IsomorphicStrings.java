import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> charIndexS = new HashMap<>();
        HashMap<Character, Integer> charIndexT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (!charIndexS.containsKey(charS)) {
                charIndexS.put(charS, i);
            }

            if (!charIndexT.containsKey(charT)) {
                charIndexT.put(charT, i);
            }

            if (!charIndexS.get(charS).equals(charIndexT.get(charT))) {
                return false;
            }
        }

        return true;
    }

    // Optional main method to test the function in VS Code
    public static void main(String[] args) {
        IsomorphicStrings solution = new IsomorphicStrings();
        String s = "egg";
        String t = "add";
        System.out.println("Is Isomorphic: " + solution.isIsomorphic(s, t));
    }
}
