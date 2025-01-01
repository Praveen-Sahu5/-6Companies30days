// Solution.java
import java.util.Scanner;

public class Second {

    // Method to find the winner of the game
    public int findTheWinner(int n, int k) {
        return helper(n, k) + 1;
    }

    // Recursive helper function
    public int helper(int n, int k) {
        if (n == 1)
            return 0;
        else
            return (helper(n - 1, k) + k) % n;
    }

    // Main method for testing
    public static void main(String[] args) {
        Second solution = new Second();
        Scanner scanner = new Scanner(System.in);

        // Input data
        System.out.println("Enter the number of friends (n):");
        int n = scanner.nextInt();
        System.out.println("Enter the step count (k):");
        int k = scanner.nextInt();

        // Find the winner
        int winner = solution.findTheWinner(n, k);

        // Output the result
        System.out.println("The winner is friend #" + winner);

        scanner.close();
    }
}
