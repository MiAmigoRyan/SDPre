public class Objective7Lab3 {
	public static void main (String[] args){
		int counter = 0;

		while (counter <= 20){
			int counterUp = counter++;
			if (counterUp % 2 == 0){
				System.out.println(counterUp+" is even.");
			}else
				System.out.println(counterUp+" is odd.");
		}
	}
}