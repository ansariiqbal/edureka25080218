package day6;

public class DemoMultipleBrowser {

	public static void main(String[] args) {
	MultipleBrowser mb = new MultipleBrowser();
		
		mb.invokeBrowser("firefox");
		mb.navigateComands();
		mb.getPageTitle();
		System.out.println("Demo " + mb.getPageTitle());
		mb.closeBrowser();
		
	}
}


