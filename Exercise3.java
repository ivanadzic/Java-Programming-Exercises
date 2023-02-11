import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the year of the start of work:");
    int startOfWork = sc.nextInt();

    System.out.println("Enter the current year:");
    int currentYear = sc.nextInt();

    int lengthOfService = currentYear - startOfWork;

    if (lengthOfService >= 0 && lengthOfService < 40) {
      if (lengthOfService <= 4) {
        System.out.println("You are a Junior Programmer");
      } else if (lengthOfService <= 8) {
        System.out.println("You are a Senior Programmer.");
      } else {
        System.out.println("You are a Company director.");
      }
    } else {
      System.out.println("You are retired.");
    }

  }
}
