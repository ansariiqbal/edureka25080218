package selenium;

public class DemoGuru99 {

	public static void main(String[] args) {
		Guru99Project guru = new Guru99Project();
		
		guru.invokeBrowser();
		
		guru.printTitleOfThePage();
		guru.login("mngr157834", "pusAhez");
		guru.printTitleOfThePage();
		
		
	}

}
