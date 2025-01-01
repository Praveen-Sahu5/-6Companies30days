// Solution.java
import java.util.Scanner;

public class First {

    // Method to check if the circle overlaps with the rectangle
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        // Calculate the closest point on the rectangle to the center of the circle
        int closestX = Math.max(x1, Math.min(xCenter, x2));
        int closestY = Math.max(y1, Math.min(yCenter, y2));

        // Calculate the distance between the closest point and the center of the circle
        int distanceX = xCenter - closestX;
        int distanceY = yCenter - closestY;

        // Calculate the squared distance
        int squaredDistance = distanceX * distanceX + distanceY * distanceY;

        // Compare the squared distance with the squared radius
        return squaredDistance <= radius * radius;
    }

    // Main method for testing
    public static void main(String[] args) {
        First solution = new First();
        Scanner scanner = new Scanner(System.in);

        // Input data
        System.out.println("Enter the radius of the circle:");
        int radius = scanner.nextInt();
        System.out.println("Enter the x-coordinate of the circle's center:");
        int xCenter = scanner.nextInt();
        System.out.println("Enter the y-coordinate of the circle's center:");
        int yCenter = scanner.nextInt();
        System.out.println("Enter the coordinates of the rectangle (x1, y1, x2, y2):");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        // Check overlap
        boolean result = solution.checkOverlap(radius, xCenter, yCenter, x1, y1, x2, y2);

        // Output result
        if (result) {
            System.out.println("The circle overlaps with the rectangle.");
        } else {
            System.out.println("The circle does not overlap with the rectangle.");
        }

        scanner.close();
    }
}
