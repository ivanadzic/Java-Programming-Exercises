import java.util.Scanner;

public class Exercise1 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Discount
    double discountPercent = 30;
    double base = discountPercent / 100;

    System.out.println("Welcome to our little fruit paradise.");
    System.out.println("Below, enter the names of the fruits you have chosen, as well as their prices.\n");

    // The name of the first fruit
    System.out.print("Enter the name of the first article: ");
    String firstFruitName = sc.next();

    // The price of the first fruit with a discount
    System.out.print("Enter the price for " + firstFruitName + ": ");
    double firstFruitPrice = sc.nextDouble();
    firstFruitPrice -= firstFruitPrice * base;
    System.out.println();

    // The name of the second fruit
    System.out.print("Enter the name of the second article: ");
    String secondFruitName = sc.next() ;

    // The price of the second fruit with a discount
    System.out.print("Enter the price for " + secondFruitName + ": ");
    double secondFruitPrice = sc.nextDouble();
    secondFruitPrice -= secondFruitPrice * base;
    System.out.println();

    // The name of the third fruit
    System.out.print("Enter the name of the third article: ");
    String thirdFruitName = sc.next();

    // The price of the third fruit with a discount
    System.out.print("Enter the price for " + thirdFruitName + ": ");
    double thirdFruitPrice = sc.nextDouble();
     thirdFruitPrice -= thirdFruitPrice * base;
    System.out.println();

     // The name of the fourth fruit
    System.out.print("Enter the name of the fourth article: ");
    String fourthFruitName = sc.next();

    // The price of the fourth fruit with a discount
    System.out.print("Enter the price for " + fourthFruitName + ": ");
    double fourthFruitPrice = sc.nextDouble();
    fourthFruitPrice -= fourthFruitPrice * base;
    System.out.println();

    System.out.println("You have received a 30% discount on the following items:");
    System.out.println("--------------------------------------------------");

    System.out.println("Product name: " + firstFruitName);
    System.out.println("New price for " +  firstFruitName + " is: " + firstFruitPrice + "\n");

    System.out.println("Product name: " + secondFruitName);
    System.out.println("New price for " +  secondFruitName + " is: " + secondFruitPrice + "\n");

    System.out.println("Product name: " + thirdFruitName);
    System.out.println("New price for " +  thirdFruitName + " is: " + thirdFruitPrice + "\n");

    System.out.println("Product name: " + fourthFruitName);
    System.out.println("New price for " +  fourthFruitName + " is: " + fourthFruitPrice + "\n");
  }
}
