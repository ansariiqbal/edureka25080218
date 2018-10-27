package day4;

public class ExeWorkingWithFirefox {

	public static void main(String[] args) {
		WorkingWithMozilla wm = new WorkingWithMozilla();
		wm.invokeBrowser();
		System.out.println(wm.getPageTitle());
		wm.navigateComands();
		wm.closeBrowser();	
	}
}
