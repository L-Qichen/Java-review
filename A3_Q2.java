import java.util.Scanner;

public class A3_Q2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] nameArr = new String[20];
    double[] timeArr = new double[20];
    int firstPodiumIndex = -1;
    int secondPodiumIndex = -1;
    int thirdPodiumIndex = -1;
    boolean addSkiers = true;

    for (int i = 0; i < 20 && addSkiers; i++) {
      System.out.print("Please input the skier's name: ");
      String name = sc.next();
      System.out.print("Please input the skier's time: ");
      int time = sc.nextInt();
      if (i == 0) {
        firstPodiumIndex = 0;
        nameArr[i] = name;
        timeArr[i] = time;
        System.out.println(
            "First podium goes to " + nameArr[firstPodiumIndex] + " who made it in " + timeArr[firstPodiumIndex]
                + " second(s)");
      } else if (i == 1) {
        if (time < timeArr[0]) {
          firstPodiumIndex = 1;
          secondPodiumIndex = 0;
        } else {
          secondPodiumIndex = 1;
        }
        nameArr[i] = name;
        timeArr[i] = time;
        System.out.println(
            "First podium goes to " + nameArr[firstPodiumIndex] + " who made it in " + timeArr[firstPodiumIndex]
                + " second(s)");
        System.out.println(
            "Second podium goes to " + nameArr[secondPodiumIndex] + " who made it in " + timeArr[secondPodiumIndex]
                + " second(s)");
      } else {
        if (time < timeArr[firstPodiumIndex]) {
          thirdPodiumIndex = secondPodiumIndex;
          secondPodiumIndex = firstPodiumIndex;
          firstPodiumIndex = i;
        } else if (time < timeArr[secondPodiumIndex]) {
          thirdPodiumIndex = secondPodiumIndex;
          secondPodiumIndex = i;
        } else if (time < timeArr[thirdPodiumIndex]) {
          thirdPodiumIndex = i;
        }
        nameArr[i] = name;
        timeArr[i] = time;
        System.out.println(
            "First podium goes to " + nameArr[firstPodiumIndex] + " who made it in " + timeArr[firstPodiumIndex]
                + " second(s)");
        System.out.println(
            "Second podium goes to " + nameArr[secondPodiumIndex] + " who made it in " + timeArr[secondPodiumIndex]
                + " second(s)");
        System.out.println(
            "Third podium goes to " + nameArr[thirdPodiumIndex] + " who made it in " + timeArr[thirdPodiumIndex]
                + " second(s)");
      }

      if (i == 19) {
        System.out
            .println("Congratulations to the winners: " + nameArr[firstPodiumIndex] + " " + nameArr[secondPodiumIndex]
                + " " + nameArr[thirdPodiumIndex]);
        System.out.println("Goodbye!");
      } else {
        System.out.print("Do you want to add a new skier? (y/yes): ");
        String answer = sc.next();
        if (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("yes")) {
          System.out.println("Goodbye!");
          System.exit(0);
        }
      }

    }

    sc.close();
  }
}
