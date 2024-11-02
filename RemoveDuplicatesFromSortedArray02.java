class RemoveDuplicatesFromSortedArray02 {
    public int removeDuplicates(int[] nums) {
        int k = 2;  // Allow up to two duplicates

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;        
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray02 solution = new RemoveDuplicatesFromSortedArray02();

        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5};
        
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
