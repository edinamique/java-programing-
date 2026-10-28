import java.util.Scanner;

public class mushroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask questions
        System.out.print("Does your mushroom have gills? (yes/no): ");
        boolean hasGills = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Does your mushroom grow in a forest? (yes/no): ");
        boolean growsInForest = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Does your mushroom have a ring? (yes/no): ");
        boolean hasRing = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Does your mushroom have a convex cup? (yes/no): ");
        boolean hasConvexCup = scanner.next().equalsIgnoreCase("yes");

        String mushroom = "Unknown mushroom";

        // Decision logic
        if (!hasGills) {
            mushroom = "Cepe de Bordeaux"; // only one with pores
        } else if (!growsInForest) {
            if (hasRing) {
                mushroom = "Coprin Chevelu";
            } else {
                mushroom = "Agaric Jaunissant";
            }
        } else { // grows in forest
            if (hasRing) {
                mushroom = "Amanite Tue-Mouche";
            } else if (hasConvexCup) {
                mushroom = "Pied Bleu";
            } else {
                mushroom = "Girolle";
            }
        }

        System.out.println("Your mushroom is: " + mushroom);
    }
}
