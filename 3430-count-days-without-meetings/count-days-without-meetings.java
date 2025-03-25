import java.util.*;

class Solution {
    public int countDays(int days, int[][] meetings) {
        TreeMap<Long, Integer> events = new TreeMap<>();
        
        for (int[] meeting : meetings) {
            long start = meeting[0];
            long end = meeting[1];
            
            events.put(start, events.getOrDefault(start, 0) + 1);
            events.put(end + 1, events.getOrDefault(end + 1, 0) - 1);
        }

        long currentMeetings = 0;
        long previousDay = 0;
        long totalCovered = 0;

        for (Map.Entry<Long, Integer> entry : events.entrySet()) {
            long day = entry.getKey();
            int change = entry.getValue();
            
            if (currentMeetings > 0) {
                totalCovered += day - previousDay;
            }

            currentMeetings += change;
            previousDay = day;
        }

        return (int) (days - totalCovered);
    }
}
