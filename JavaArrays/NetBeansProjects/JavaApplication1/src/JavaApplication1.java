import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: start and end times
        System.out.print("Enter start time (0-23): ");
        int start = scanner.nextInt();
        System.out.print("Enter end time (1-24): ");
        int end = scanner.nextInt();

        // Validate input
        if (start < 0 || start > 23 || end < 1 || end > 24 || start >= end) {
            System.out.println("Invalid input. Please follow the rules.");
            return;
        }

        int totalCost = 0;

        // Loop through each hour of rental
        for (int hour = start; hour < end; hour++) {
            if ((hour >= 0 && hour < 7) || (hour >= 21 && hour < 24)) {
                totalCost += 500;   // 0–7 and 21–24
            } else if ((hour >= 7 && hour < 14) || (hour >= 19 && hour < 21)) {
                totalCost += 1000;  // 7–14 and 19–21
            } else if (hour >= 14 && hour < 19) {
                totalCost += 1500;  // 14–19
            }
        }

        // Output result
        System.out.println("Total rental cost: " + totalCost + " RWF");
    }
}
