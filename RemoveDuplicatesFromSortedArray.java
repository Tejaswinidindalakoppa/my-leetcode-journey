class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

        int[] nums = {1, 1, 2, 2, 3, 3, 4, 5, 5};
        
        // Call the removeDuplicates method
        int newLength = solution.removeDuplicates(nums);

        // Print the modified array and the new length
        System.out.print("Modified Array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nNew Length: " + newLength);
    }
}
