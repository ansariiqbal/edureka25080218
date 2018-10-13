package day3;

public class Employee { // this is just a class and not main so cannot run/execute
	
	int salary; // class level
	int bonus; // class level
	
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
			
		totalSalary = salary + bonus;		
		System.out.println("Total salary is : "+ totalSalary);
	}
	
	int calculateSalary2() {
		
		totalSalary = salary + bonus;
		
		return totalSalary;
		
	}
        int calculateSalary3(int sal, int bon) {
		
		totalSalary = sal + bon;
		
		return totalSalary;
		
	}
	
        int calculateSalary4(int salary, int bonus) {
    		
    		totalSalary = this.salary + this.bonus; // class level
    		
    		return totalSalary;
    		
    	}

}
