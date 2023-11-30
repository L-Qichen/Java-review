
import java.util.Scanner;

public class A3_Q2 {

	public static void main(String[] args) {
		
		
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[20];
        double[] times = new double[20];
        int firstPodiumIndex = -1;
        int secondPodiumIndex = -1;
        int thirdPodiumIndex = -1;

        System.out.println("Welcome to Mont-Halloween Skiing Contest Ranker.");
        System.out.println("Whenever a skier makes it to the finish line, enter their name and skiing time");

        int skierCount = 0;
        while (skierCount < 20) {
            System.out.print("Please input the skier's name: ");
            String name = scanner.next();
            System.out.print("Please input the skier's time: ");
            double time = scanner.nextDouble();

            names[skierCount] = name;
            times[skierCount] = time;

            if (firstPodiumIndex == -1 || time < times[firstPodiumIndex]) {
                thirdPodiumIndex = secondPodiumIndex;
                secondPodiumIndex = firstPodiumIndex;
                firstPodiumIndex = skierCount;
            } else if (secondPodiumIndex == -1 || time < times[secondPodiumIndex]) {
                thirdPodiumIndex = secondPodiumIndex;
                secondPodiumIndex = skierCount;
            } else if (thirdPodiumIndex == -1 || time < times[thirdPodiumIndex]) {
                thirdPodiumIndex = skierCount;
            }

            System.out.printf("First podium goes to %s who made it in %.1f second(s)\n", names[firstPodiumIndex], times[firstPodiumIndex]);
            if (secondPodiumIndex != -1) {
                System.out.printf("Second podium goes to %s who made it in %.1f second(s)\n", names[secondPodiumIndex], times[secondPodiumIndex]);
            }
            if (thirdPodiumIndex != -1) {
                System.out.printf("Third podium goes to %s who made it in %.1f second(s)\n", names[thirdPodiumIndex], times[thirdPodiumIndex]);
            }

            System.out.print("Do you want to add another skier? y/yes: ");
            String input = scanner.next().toLowerCase();
            if (!(input.equals("y") || input.equals("yes"))) {
                System.out.println("Goodbye!");
                break;
            }

            skierCount++;
        }

        scanner.close();
	
	}

}
