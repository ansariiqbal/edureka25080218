package day6;

public class Employee {
	
	private int salary;
	private int bonus;
	private int totalSalary;
	
	public void setSalary(int salary) {
		if(salary > 0) {
			this.salary = salary;
		} else {
			System.err.println("Invalid Salary");
		}
	}

	public void setBonus(int bonus) {
		if (bonus > 0) {
			this.bonus = bonus;
		} else {
			System.err.println("Invalid Bonus");
		}
	}
	
	public int getTotalSalary() {
		return totalSalary;
	}

	void calculateSalary() {
			
		totalSalary = salary + bonus;
		if ((salary > 0) && (bonus > 0)){
		System.out.println("Total salary is : "+ totalSalary);
		} else {
			System.err.println("Invalid Total");
		}
	}
	
}