package day2;

public class DemoEmployee {

	public static void main(String[] args) {

		// 1. Declaring an object
		Employee saurabh;
		
		// 2. Instantiating ("new" word will create memory locations) and 3. Initializing the object
		saurabh = new Employee();
		
		saurabh.salary = 90000;
		
		saurabh.bonus = 30000;
		
		saurabh.calculateSalary();
		
		System.out.println("---------------------------------");
		
		Employee sapna = new Employee();
		
		sapna.salary = 80000;
		sapna.bonus = 25000;
		
		int totalSalary = sapna.calculateSalary2();
				
				System.out.println("Total Salary : "+ totalSalary);
		
	}

}
