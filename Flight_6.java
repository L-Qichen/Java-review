import java.util.Scanner;

public class Flight_6 {
  // Instance variables
  private String Line;
  private int capacity;
  private boolean isDelay;

  // Default constructor
  public Flight_6() {
    this.Line = null;
    this.capacity = 0;
    this.isDelay = false;
  }

  // Parameterized constructor
  public Flight_6(String line, int capacity, boolean isDelay) {
    this.Line = line;
    this.capacity = capacity;
    this.isDelay = isDelay;
  }

  // Accessor methods
  public String getLine() {
    return this.Line;
  }

  public int getCapacity() {
    return this.capacity;
  }

  public boolean getIsDelay() {
    return this.isDelay;
  }

  // Mutator methods
  public void setLine(String line) {
    this.Line = line;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public void setIsDelay(boolean isDelay) {
    this.isDelay = isDelay;
  }

  // equals method
  public boolean equals(Flight_6 otherFlight) {
    return this.Line.equals(otherFlight.getLine()) && this.capacity == otherFlight.getCapacity()
        && this.isDelay == otherFlight.getIsDelay();
  }

  // bothDelayed method
  public boolean bothDelayed(Flight_6 otherFlight) {
    return this.isDelay && otherFlight.getIsDelay();
  }

  public String toString() {
    return "The Flight on line " + this.Line + " has " + this.capacity + " passengers and is delay is " + this.isDelay;
  }

  public static void main(String[] args) {
    // Create a Scanner object
    Scanner sc = new Scanner(System.in);
    System.out.print("On which line is this Flight? ");
    // Read user given input in a string named line
    String line2 = sc.nextLine();
    System.out.print("What capacity does it have? ");
    // Read user provided input in an int named capacity
    int capacity2 = sc.nextInt();
    System.out.print("Is it a delayed Flight? (true or false) ");
    // Read user provided boolean input
    boolean isDelay2 = sc.nextBoolean();
    // Consume the newline character
    sc.nextLine();

    // Create 2 flight objects
    Flight_6 flight1 = new Flight_6(); // Used default constructor
    Flight_6 flight2 = new Flight_6(line2, capacity2, isDelay2); // Used parameterized constructor

    System.out.println("The two Flights are:");
    System.out.println(flight1);
    System.out.println(flight2);

    System.out.println("\nLet's set up the 1st Flight ...");
    System.out.print("\tWhat line is it? ");
    // Read user given input for flight1
    String line1 = sc.nextLine();

    System.out.print("\tWhat is the capacity? ");
    // Read user given input for flight1
    int capacity1 = sc.nextInt();

    System.out.print("\tIs it a delayed Flight (true or false)? ");
    // Read user given input for flight1
    boolean isDelay1 = sc.nextBoolean();

    // Initialize flight1 object's instance variables using set methods
    flight1.setLine(line1);
    flight1.setCapacity(capacity1);
    flight1.setIsDelay(isDelay1);

    // Print flight1 info
    System.out.println("Flight 1: " + flight1);

    if (flight1.equals(flight2))
      System.out.println("Are the 2 Flight objects equal? " + "Yes");
    else
      System.out.println("Are the 2 Flight objects equal? " + "No");

    System.out.println("Are they both delayed Flights? " + flight1.bothDelayed(flight2));

    // Set isDelay of 1st flight to true (now both flights are delayed)
    flight1.setIsDelay(true);
    System.out.println("Now are they both delayed Flights? " + flight1.bothDelayed(flight2));
  }
}