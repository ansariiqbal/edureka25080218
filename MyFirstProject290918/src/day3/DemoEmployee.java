package day3;

public class DemoEmployee {

	public static void main(String[] args) {

		Employee sapna = new Employee(); // we are calling constructor class Employee()
		// class name sapna = new constructor()
		
		sapna.salary = 90000; // defined under Employee class - class level
		sapna.bonus = 8000; // defined under Employee class - class level
		String name = "Sapna";
		
		int sapnaSalary = sapna.calculateSalary4(10000, 5000); // argument level will be ignored if used by this.salary
		
		System.out.println("Salary of " + name +" : "+ sapnaSalary);
		System.out.println("-----------------------------");
		
		Employee Sagar = new Employee();
		
		Sagar.calculateSalary(); //values not defined here, but in constructor class
		System.out.println("-----------------------------");
		
		Employee Banu = new Employee(40000, 5000); // values defined here
		
		Banu.calculateSalary();
	}

}
