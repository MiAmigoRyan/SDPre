public class Objective3Lab2 {
	public static void main(String[] args){
		double side1, side2, hypotenuse;
		side1 = 8;
		side2 = 15;
		hypotenuse = (side1*side1)+(side2+side2);
		double result = Math.sqrt(hypotenuse);
		System.out.println("The hypotenuse of a triangle with sides"+side1+" and "+side2+" is "+result);
	}
}