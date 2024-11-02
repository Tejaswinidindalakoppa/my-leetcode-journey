import java.util.HashMap;
import java.util.Map;

class TwoSum {

    // Method to find two numbers in the array that add up to the target value
    public int[] twoSum(int[] nums, int target) {

        // Create a HashMap to store numbers and their corresponding indices
        Map<Integer, Integer> numToIndexMap = new HashMap<>();
        
        // Get the size of the input array
        int sizeOfArray = nums.length;

        // Loop through the array
        for (int i = 0; i < sizeOfArray; i++) {
            // Calculate the difference between the target and the current number
            int diff = target - nums[i];

            // Check if the difference already exists in the map
            if (numToIndexMap.containsKey(diff)) {
                // If it exists, return the indices of the current number and the number that adds up to the target
                return new int[]{i, numToIndexMap.get(diff)};
            }

            // If it doesn't exist, add the current number and its index to the map
            numToIndexMap.put(nums[i], i);
        }

        // If no two numbers add up to the target, return null
        return null;
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        // Sample input
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the twoSum method
        int[] result = solution.twoSum(nums, target);

        // Print the result
        if (result != null) {
            System.out.println("Indices of the two numbers are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }
    }
}
