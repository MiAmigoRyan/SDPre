import java.util.Scanner;

public class Objective5Lab4 {
	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	int userNum;

	System.out.println("Please enter a whole number");
	userNum = kb.nextInt();

	if (userNum % 2 == 0) {
		System.out.println(userNum+" is even.");
	}
	else{
		System.out.println(userNum+" is odd.");
	}

	kb.close();
	}
}