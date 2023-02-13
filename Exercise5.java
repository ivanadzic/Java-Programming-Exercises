import java.util.Scanner;

public class Exercise5 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Choose your shirt size (24 / 30 / 36 / 42):");
    int shirtSize = sc.nextInt();

    switch (shirtSize) {
      case 24:
        System.out.println("You have selected the S size of the shirt.");
        break;
      case 30:
        System.out.println("You have selected the M size of the shirt.");
        break;
      case 36:
        System.out.println("You have selected the L size of the shirt.");
        break;
      case 42:
        System.out.println("You have selected the XL size of the shirt.");
        break;
      default:
        System.out.println("Size doesn't exist.");
    }
  }
}
