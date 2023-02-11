package Domaci;

import java.util.Scanner;

public class Exercise2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your year of birth: ");
    int yearOfBirth = sc.nextInt();

    System.out.print("Enter the current year: ");
    int currentYear = sc.nextInt();

    int userAge = currentYear - yearOfBirth;

    System.out.println();
    System.out.println("You are " + userAge + " years old.");

  }
}
