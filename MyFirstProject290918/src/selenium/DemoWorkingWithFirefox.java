package selenium;

import org.apache.xerces.util.SynchronizedSymbolTable;

public class DemoWorkingWithFirefox {

	public static void main(String[] args) {
		WorkingWithFirefoxDriver we = new WorkingWithFirefoxDriver();
		
		we.invokeBrowser();
		
		System.out.println("before get Title");
		System.out.println(we.getPageTitle());
		System.out.println("after get Title");
		
		
		we.navigateComands();
		
		we.closeBrowser();

	}

}
