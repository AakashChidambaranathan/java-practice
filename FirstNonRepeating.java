import java.util.*;

public class FirstNonRepeating {
    public static void main(String args[]) {
        String s = "aabbcdd"; // Input string
        findFirstNonRepeating(s);
    }

    public static void findFirstNonRepeating(String s) {
        // Create a HashMap to store frequency of characters
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freqMap.get(s.charAt(i)) == 1) {
                System.out.println(s.charAt(i) + " " + i);
                return;
            }
        }

        // If no non-repeating character found
        System.out.println(-1);
    }
}
