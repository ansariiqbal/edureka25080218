package selenium;

public class ExeWorkingWithEdge {

	public static void main(String[] args) {
		WorkingWithEdge wm = new WorkingWithEdge();
		wm.invokeBrowser();
		System.out.println(wm.getPageTitle());
		wm.navigateComands();
		wm.closeBrowser();	
	}
}
