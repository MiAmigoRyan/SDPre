import java.util.Scanner;
public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int userNum;

      System.out.println("Please enter a number: ");
      userNum = scanner.nextInt();

      if (userNum > 0) {
        System.out.println(userNum+" is a positive number.");
      }
      else if (userNum == 0) {
        System.out.println(userNum+" is neither negative or positive!");
      }
      else if (userNum < 0) {
        System.out.println(userNum+" is a negative number.");
      }
      /*
        Expected:
        Please enter a number:
          3
        The number is positive
      */

      scanner.close();
  }
}