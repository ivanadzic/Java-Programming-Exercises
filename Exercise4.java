import java.util.Scanner;

public class Exercise4 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your job position (Physicist / Engineer / Machine operator)");
    String jobPosition = sc.next();

    System.out.println("Enter monthly salary:");
    double monthlySalary = sc.nextDouble();

    double salaryIncreaseePhysicist = 15;
    double salaryIncreaseeEngineer = 20;
    double salaryIncreaseeMachineOperator = 30;

    if (jobPosition.equalsIgnoreCase("Physicist")) {

      monthlySalary += monthlySalary * (salaryIncreaseePhysicist / 100);
      System.out.println("Salary with increase for the position " + jobPosition + " is: " + monthlySalary + " EUR.");

    } else if (jobPosition.equalsIgnoreCase("inzenjer")) {

      monthlySalary += monthlySalary * (salaryIncreaseeEngineer / 100);
      System.out.println("Salary with increase for the position " + jobPosition + " is: " + monthlySalary + " EUR.");

    } else if (jobPosition.equalsIgnoreCase("masinovodja")) {

      monthlySalary += monthlySalary * (salaryIncreaseeMachineOperator / 100);
      System.out.println("Salary with increase for the position " + jobPosition + " is: " + monthlySalary + " EUR.");

    } else {
      System.out.println("The position you entered does not exist.");
    }

  }
}
