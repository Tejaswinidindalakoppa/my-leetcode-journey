class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            return new int[][] { newInterval };
        }

        List<int[]> list = new ArrayList<>();
        int i = 0;

        // Add intervals that come before the new interval without overlap
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            list.add(intervals[i++]);
        }

        // Merge overlapping intervals with the new interval
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        list.add(newInterval);

        // Add remaining intervals
        while (i < intervals.length) {
            list.add(intervals[i++]);
        }

        return list.toArray(new int[list.size()][2]);
    }
}