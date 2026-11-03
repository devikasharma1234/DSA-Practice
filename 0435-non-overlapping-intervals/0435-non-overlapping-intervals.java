import java.util.Arrays;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        // Sort intervals by ending time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        int lastEnd = Integer.MIN_VALUE;

        for (int[] interval : intervals) {

            if (interval[0] >= lastEnd) {
                // Keep the interval
                count++;
                lastEnd = interval[1];
            }
            // Otherwise, skip (remove) the overlapping interval
        }

        // Total intervals - intervals kept
        return intervals.length - count;
    }
}