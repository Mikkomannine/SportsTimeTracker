import java.util.ArrayList;
import java.util.Scanner;

public class SportsTimeTracker {
    static class Activity {
        String name;
        int timeSpent;

        Activity(String name, int timeSpent) {
            this.name = name;
            this.timeSpent = timeSpent;
        }
    }

    private static ArrayList<Activity> activities = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Log Activity");
            System.out.println("2. View Activities");
            System.out.println("3. Calculate Total Time");
            System.out.println("4. Exit");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (option) {
                case 1:
                    logActivity(scanner);
                    break;
                case 2:
                    viewActivities();
                    break;
                case 3:
                    calculateTotalTime();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void logActivity(Scanner scanner) {
        System.out.print("Enter activity name: ");
        String name = scanner.nextLine();
        System.out.print("Enter time spent (in minutes): ");
        int timeSpent = scanner.nextInt();
        activities.add(new Activity(name, timeSpent));
        System.out.println("Activity logged successfully.");
    }

    private static void viewActivities() {
        if (activities.isEmpty()) {
            System.out.println("No activities logged yet.");
        } else {
            System.out.println("\nLogged Activities:");
            for (Activity activity : activities) {
                System.out.println("Activity: " + activity.name + ", Time Spent: " + activity.timeSpent + " minutes");
            }
        }
    }

    private static void calculateTotalTime() {
        int totalTime = 0;
        for (Activity activity : activities) {
            totalTime += activity.timeSpent;
        }
        System.out.println("Total time spent on sports: " + totalTime + " minutes");
    }
}
