package day6;

import java.util.Scanner;

public class DemoMultipleBrowserUserInput {

	public static void main(String[] args) {
	MultipleBrowser mb = new MultipleBrowser();
	int choice;
	String brsr; 
	
	System.out.println("1. Chrome");
	System.out.println("2. FireFox");
	System.out.println("3. Edge");
	System.out.println("Enter choice:");
	Scanner sc = new Scanner(System.in);
	choice = sc.nextInt();
	
		if (choice == 1) {
			System.out.println("1 selected");
			brsr = "chrome";		
		} else if (choice == 2) {
			System.out.println("2 selected");
			brsr = "firefox";
		} else if (choice == 3) {
			System.out.println("3 selected");
			brsr = "edge"; 
		} else  {
			System.out.println("Invalid Choice; Chrome being used");
			brsr = "chrome";
		}
	
		mb.invokeBrowser(brsr);
		mb.navigateComands();
		mb.getPageTitle();
		System.out.println("Multibrowser : " + mb.getPageTitle());
		mb.closeBrowser();
		sc.close();
		
	}
}