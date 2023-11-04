import java.util.Scanner;

class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = null;
    int validOperation = 0;
    boolean y = true;

    System.out.println("Welcome to this calculator, offering Addition and Subtraction.");
    while (y) {
      // first
      do {
        System.out.print("Please select 1 for Addition or 2 for Subtraction: ");
        input = sc.next();
        if (input.length() >= 2 || input.length() <= 0) {
          System.out.println("Operation not supported." + validOperation);
          validOperation = 0;
        } else if (input.charAt(0) < '1' || input.charAt(0) > '2') {
          validOperation = 3;
          System.out.println("Operation not supported." + validOperation);
        } else {
          validOperation = Integer.parseInt(input);
        }
      } while (validOperation != 1 && validOperation != 2);

      // second
      System.out.print("Please input your numbers: ");
      int count = sc.nextInt();
      double result = 0;
      switch (validOperation) {
        case 1:
          for (int i = 0; i < count; i++) {
            if (sc.hasNextDouble()) {
              result += sc.nextDouble();
            } else {
              result += 0.0;
            }
          }
          result = Math.round(result * 100.00) / 100.00;
          System.out.println("Addition: " + " : " + count + " :: " + result);
          break;

        default:
          result = sc.nextDouble();
          for (int i = 0; i < count - 1; i++) {
            if (sc.hasNextDouble()) {
              result -= sc.nextDouble();
            } else {
              result -= 0.0;
            }
          }
          result = (double) Math.round(result * 100) / 100;
          System.out.println("Subtraction: " + ":" + count + "::" + result);
          break;
      }

      System.out.print("Do you want to perform another operation? y/yes: ");
      String ans = sc.next();
      if (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("yes")) {
        y = false;
        System.out.println("Goodbye!");
      }
    }

    sc.close();
  }
}
