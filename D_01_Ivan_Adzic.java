package Domaci;

import java.util.Scanner;
public class D_01_Ivan_Adzic {
  public static void main(String[] args) {
    // Napraviti program gde cete uneti informacije o nekom vocu
    // tako sto cete kreirati String za naziv nekog voca i double vrednost za njegovu cenu.
    // Uneti 4 naziva i 4 cene za odredjeno voce,
    // i u svakom redu posebno stampati naziv vocke i njenu cenu za 30% snizenu.

    Scanner sc = new Scanner(System.in);

    // Popust
    double popust = 30;
    double osnovica = popust / 100;

    System.out.println("Dobrodošli u naš mali voćni raj.");
    System.out.println("U nastavku unesite nazive voća za koji ste se odlučili, kao i njegove cene.\n");

    // Naziv voca 1
    System.out.print("Unesite naziv prvog artikla: ");
    String nazivVoca1 = sc.next();

    // Cena voca 1 sa popustom
    System.out.print("Unesite cenu za " + nazivVoca1 + ": ");
    double cenaVoca1 = sc.nextDouble();
    cenaVoca1 -= cenaVoca1 * osnovica;
    System.out.println();

    // Naziv voca 2
    System.out.print("Unesite naziv drugog artikla: ");
    String nazivVoca2 = sc.next() ;

    // Cena voca 2 sa popustom
    System.out.print("Unesite cenu za " + nazivVoca2 + ": ");
    double cenaVoca2 = sc.nextDouble();
    cenaVoca2 -= cenaVoca2 * osnovica;
    System.out.println();

    // Naziv voca 3
    System.out.print("Unesite naziv trećeg artikla: ");
    String nazivVoca3 = sc.next();

    // Cena voca 3 sa popustom
    System.out.print("Unesite cenu za " + nazivVoca3 + ": ");
    double cenaVoca3 = sc.nextDouble();
     cenaVoca3 -= cenaVoca3 * osnovica;
    System.out.println();

     // Naziv voca 4
    System.out.print("Unesite naziv četvrtog artikla: ");
    String nazivVoca4 = sc.next();

    // Cena voca 4 sa popustom
    System.out.print("Unesite cenu za " + nazivVoca4 + ": ");
    double cenaVoca4 = sc.nextDouble();
    cenaVoca4 -= cenaVoca4 * osnovica;
    System.out.println();

    System.out.println("Ostvarili ste 30% popusta na sledeće artikle:");
    System.out.println("--------------------------------------------------");

    System.out.println("Naziv artikla: " + nazivVoca1);
    System.out.println("Nova cena za " +  nazivVoca1 + " iznosi: " + cenaVoca1 + "\n");

    System.out.println("Naziv artikla: " + nazivVoca2);
    System.out.println("Nova cena za " +  nazivVoca2 + " iznosi: " + cenaVoca2 + "\n");

    System.out.println("Naziv artikla: " + nazivVoca3);
    System.out.println("Nova cena za " +  nazivVoca3 + " iznosi: " + cenaVoca3 + "\n");

    System.out.println("Naziv artikla: " + nazivVoca4);
    System.out.println("Nova cena za " +  nazivVoca4 + " iznosi: " + cenaVoca4 + "\n");
  }
}
