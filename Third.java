// Solution.java
import java.util.*;

public class Third {

    // Method to find the maximum number of envelopes that can be nested
    public int maxEnvelopes(int[][] E) {
        Arrays.sort(E, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int[] dp = new int[E.length];
        int ans = 0;
        for (int[] env : E) {
            int height = env[1];
            int left = Arrays.binarySearch(dp, 0, ans, height);
            if (left < 0) left = -left - 1;
            if (left == ans) ans++;
            dp[left] = height;
        }
        return ans;
    }

    // Main method for testing
    public static void main(String[] args) {
        Third solution = new Third();
        Scanner scanner = new Scanner(System.in);

        // Input number of envelopes
        System.out.println("Enter the number of envelopes:");
        int n = scanner.nextInt();

        // Input envelope dimensions
        int[][] envelopes = new int[n][2];
        System.out.println("Enter the dimensions of each envelope (width and height):");
        for (int i = 0; i < n; i++) {
            envelopes[i][0] = scanner.nextInt(); // Width
            envelopes[i][1] = scanner.nextInt(); // Height
        }

        // Find the maximum number of envelopes that can be nested
        int result = solution.maxEnvelopes(envelopes);

        // Output the result
        System.out.println("The maximum number of envelopes that can be nested is: " + result);

        scanner.close();
    }
}
