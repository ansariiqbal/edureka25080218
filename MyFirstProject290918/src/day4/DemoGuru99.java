package day4;

public class DemoGuru99 {

	public static void main(String[] args) {
		Guru99Project guru = new Guru99Project();
		
		guru.invokeBrowser();
		
		guru.printTitleOfThePage();
		guru.login("mngr157834", "pusAhez");
		guru.printTitleOfThePage();
	
		guru.addCustomer();
		
		String customerId = guru.getCustomerId();
		
		System.out.println("Customer ID : " + customerId);
		
		guru.addAccount(customerId);
		
		
	}

}
