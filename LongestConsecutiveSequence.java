import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String args[]) {
        int[] arr = { 100, 4, 200, 1, 3, 2 }; // Input array
        int result = longestConsecutive(arr);
        System.out.println(result);
    }

    public static int longestConsecutive(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int longestStreak = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
