import java.util.Scanner;

public class Objective4Lab3 {
	public static void main(String[] args){
	int birthYear, age, currentYear, i;

	Scanner input = new Scanner(System.in);
	
	System.out.println("What is the oldest you will be this year?");
	age = input.nextInt();

	System.out.println("What is the current year?");
	currentYear = input.nextInt();

	i = currentYear-age;
	birthYear = i--;

	System.out.println("If you are currently "+age+" you were born "+birthYear);
	}

}