package day2;

public class SwitchCaseStatement {

	public static void main(String[] args) {

		int numberOfday = 2;

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
	}

}
