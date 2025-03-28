import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next(); // Read input string

        String compressed = compressString(S);
        System.out.println(compressed);
    }

    public static String compressString(String S) {
        StringBuilder compressed = new StringBuilder();
        int n = S.length();

        // Count consecutive characters
        for (int i = 0; i < n; i++) {
            int count = 1;

            // Count consecutive duplicates
            while (i < n - 1 && S.charAt(i) == S.charAt(i + 1)) {
                count++;
                i++;
            }

            compressed.append(S.charAt(i));

            // Append count only if greater than 1
            if (count > 1) {
                compressed.append(count);
            }
        }

        // Return compressed string if it's shorter, otherwise original
        return compressed.length() < S.length() ? compressed.toString() : S;
    }
}
