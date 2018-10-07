package day2;

public class GreatestOutOfThreeNumbers {

	public static void main(String[] args) {

		int firstNum, secondNum, thirdNum;

		firstNum = 91;
		secondNum = 90;
		thirdNum = 91;

		if ((firstNum > secondNum) && (firstNum > thirdNum)) {
			System.out.println("First Number is Greatest");
		} else if ((firstNum < secondNum) && (secondNum > thirdNum)) {
			System.out.println("Second Number is Greatest");
		} else if ((thirdNum > secondNum) && (firstNum < thirdNum)) {
			System.out.println("Third Number is Greatest");
		} else if ((firstNum == secondNum) && (firstNum > thirdNum)) {
			System.out.println("First and Second are greater than third");
		} else if ((firstNum == thirdNum) && (firstNum > secondNum)) {
			System.out.println(" First and Third are greater than second");
		} else if ((secondNum == thirdNum) && (secondNum > firstNum)) {
			System.out.println(" Second and Third are greater than First");
		}
		
		else {
			System.out.println("All three are equal");
		}
	}
}
