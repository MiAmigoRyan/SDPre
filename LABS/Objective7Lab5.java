import java.util.Scanner;

public class Objective7Lab5 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int selection = 0;

    while (selection != 3) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = kb.nextInt();

      switch (selection){
      case 1:
      	System.out.println("Hello Human");
      	break;
      case 2:
      	System.out.println("Tacos, Pizza, Ramen");
      	break;
      case 3:
      	System.out.println("Goodbye!");
      	break;
      default:
      	System.out.println("Sorry, that is not a valid option, please try again.");
      }
    } 
  } 
}
/* EXPECTE RESULT:
      _____Menu_____
		1: Say Hello
		2: List My favorite foods
		3: Exit

		1
		Hello Human
		_____Menu_____
		1: Say Hello
		2: List My favorite foods
		3: Exit

		2
		Apples, Bananas, Coconuts
		_____Menu_____
		1: Say Hello
		2: List My favorite foods
		3: Exit

		3
		Goodbye
      */