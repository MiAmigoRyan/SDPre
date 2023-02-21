import java.util.Scanner;

public class Objective4Lab1 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//prompt user for imput of all String vars
		System.out.println("What is your first name?");
		String fname = keyboard.nextLine();
		
		System.out.println("What is your last name?");
		String lname = keyboard.nextLine();
		
		System.out.println("What is your favorite animal");
		String favoriteAnimal = keyboard.nextLine();
		
		System.out.println("What is your favorite food?");
		String favoriteFood = keyboard.nextLine();
		
		System.out.println("What is your favorite song?");
		String favoriteSong = keyboard.nextLine();
		
		//print output formatted using string concat
		System.out.println("My first name is "+fname+"\n"+"My last name is "+lname+"\n"+"My favorite animal is a "+"\n"+"My favorite food is "+favoriteFood+"\n"+"My favorite song is "+favoriteSong);
	}
}