import java.util.HashMap;

class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int res = 0;
        int majority = 0;

        for (int n : nums) {
            hash.put(n, 1 + hash.getOrDefault(n, 0));
            if (hash.get(n) > majority) {
                res = n;
                majority = hash.get(n);
            }
        }

        return res;        
    }

    public static void main(String[] args) {
        MajorityElement solution = new MajorityElement();

        // Sample input
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        // Call the majorityElement method
        int result = solution.majorityElement(nums);

        // Print the result
        System.out.println("Majority Element: " + result);
    }
}
