import java.util.Scanner;

// Class definition
class InterestCalculator {
    // Member variables
    private float principal, rate, time;

    // Method to take input from user
    public void inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amount (in Rs): ");
        principal = sc.nextFloat();

        System.out.print("Enter Rate of Interest (per annum): ");
        rate = sc.nextFloat();

        System.out.print("Enter Time (in years): ");
        time = sc.nextFloat();
        sc.close();
    }

    // Method to calculate simple interest
    public float calculateInterest() {
        return (principal * rate * time) / 100;
    }

    // Method to display all details
    public void displayData() {
        float interest = calculateInterest();
        System.out.println("---------------------------------------");
        System.out.println("Principal : Rs " + principal);
        System.out.println("Rate      : " + rate + "%");
        System.out.println("Time      : " + time + " years");
        System.out.println("Simple Interest = Rs " + interest);
    }
}

// Main class
public class SimpleInterestOperation {
    public static void main(String[] args) {
        // Create object of InterestCalculator class
        InterestCalculator obj = new InterestCalculator();

        // Taking input and showing result
        obj.inputData();
        obj.displayData();
    }
}