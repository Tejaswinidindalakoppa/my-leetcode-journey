import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> ans = new ArrayList<>();
        int count = 0;
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < nums.length; ++i) {
            if (count == 0) temp.append(nums[i]);
            count++;

            if (i < nums.length - 1 && nums[i] + 1 != nums[i + 1] && count <= 1) {
                ans.add(temp.toString());
                count = 0;
                temp.delete(0, temp.length());
            } else if (i < nums.length - 1 && nums[i] + 1 != nums[i + 1] && count > 1) {
                temp.append("->").append(nums[i]);
                ans.add(temp.toString());
                count = 0;
                temp.delete(0, temp.length());
                continue;
            }

            if (i == nums.length - 1 && count == 1) {
                ans.add(temp.toString());
            } else if (i == nums.length - 1 && count > 1) {
                temp.append("->").append(nums[i]);
                ans.add(temp.toString());
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        SummaryRanges solution = new SummaryRanges();
        int[] nums = {0, 1, 2, 4, 5, 7};

        List<String> result = solution.summaryRanges(nums);
        System.out.println("Summary Ranges: " + result);
    }
}
