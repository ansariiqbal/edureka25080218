package day2;

import java.util.Scanner;

public class LeapYearUserInput {

	public static void main(String[] args) {

		// If a year is a century year - year must be divisible by 400

		// If a year is non century year -- year must be divisible by 4 only
		int year;
		System.out.println("Enter Year:");
		Scanner sc = new Scanner(System.in);

		year = sc.nextInt();

		if ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not a Leap Year");
		}

		sc.close();
	}

}