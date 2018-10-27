package day3;

public class Employee { // this is just a class and not main so cannot run/execute
	
	int salary; // declaring at class level
	int bonus; // declaring at class level
	
	
	int totalSalary;
		
	public Employee() { // defined constructor value
		
		System.out.println("This is a constructor");
		salary = 8000;
		bonus = 2000;
		
	} 

	public Employee(int salary, int bonus) { // defined constructor value
		
		System.out.println("Method Overloading - constructor");
		this.salary = salary;
		this.bonus = bonus;
		
	}

	void calculateSalary() {
		System.out.println("This is a main calculateSalary");	
		totalSalary = salary + bonus; 	
		System.out.println("Total salary is : "+ totalSalary);
	}
	
	int calculateSalary2() {
		System.out.println("This is a calculateSalary2");
		totalSalary = salary + bonus;
		
		return totalSalary;
		
	}
        int calculateSalary3(int sal, int bon) {
        	System.out.println("This is a calculateSalary3");	
		
        	totalSalary = sal + bon;
		
        	return totalSalary;
		
	}
	
        int calculateSalary4(int salary, int bonus) {
        	System.out.println("This is a calculateSalary4 using this.");
    		
    		totalSalary = this.salary + this.bonus; // class level
    		
    		return totalSalary;
    		
    	}

}
