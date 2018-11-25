package day6;

public class Car extends Machine {
	
	int rpm;
	int engineSize; // variable overriding is not recommended.
	
	public Car() {
		
		super(9000); // access variable and method of super class
		System.out.println("Constructor in Car class");
	}
	
	public void run() {	
		System.out.println("Run method from Car class");
	}
	
	public void start() {
		System.out.println("Overriding Start method of Car class");
		restart();
	}
	

}
