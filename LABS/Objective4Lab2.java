import java.util.Scanner;

public class Objective4Lab2 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		int num1 = 0, num2 = 0, num3 = 0;
		double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

		//TODO prompt the user to get imput for all above variables.
		System.out.println("Please enter three whole numbers to add:");
		
		System.out.println("First whole number :");
		num1 = keyboard.nextInt();
		
		System.out.println("Second whole number :");
		num2 = keyboard.nextInt();

		System.out.println("Third whole number :");
		num3 = keyboard.nextInt();
		
		int wholeSum = num1+num2+num3;

		// TODO prompt the user to get impt for all of the above double variables
		System.out.println("Next, please imput three decimal numbers");

		System.out.println("First decimal :");
		dub1 = keyboard.nextDouble();

		System.out.println("Second decimal :");
		dub2 = keyboard.nextDouble();

		System.out.println("Third decimal :");
		dub3 = keyboard.nextDouble();
		
		double dubSum = dub1+dub2+dub3;

		//TODO print the sum of the three ints
		System.out.println("The sum of the the three whole numbers you choose is "+num1+" + "+num2+" + "+num3+" = "+wholeSum);
		
		//TODO print the sum of the three doubles
		System.out.println("The sum of the three decimal numbers you choose is "+dub1+" + "+dub2+" + "+dub3+" = "+dubSum);

	}
}