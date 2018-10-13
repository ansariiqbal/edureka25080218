package day2;

import java.util.Scanner;

public class SwitchCaseUserInput {

	public static void main(String[] args) {

		int numberOfday;

		System.out.println("Enter number 1 to 7:");
		Scanner sc = new Scanner(System.in);
		
		numberOfday = sc.nextInt();

		switch (numberOfday) {
		case 1:
			System.err.println("Sunday");
			break;
		case 2:
			System.err.println("Monday");
			break;
		case 3:
			System.err.println("Tuesday");
			break;
		case 4:
			System.err.println("Wednesday");
			break;
		case 5:
			System.err.println("Thrusday");
			break;
		case 6:
			System.err.println("Friday");
			break;
		case 7:
			System.err.println("Saturday");
			break;

		default:
			System.err.println("Invalid Day");
			break;
		}
		
		sc.close();
	}

}
