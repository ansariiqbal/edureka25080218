package day6;

public class Machine {
	
	/*public Machine() {
		System.out.println("Constructor in Machine class");
	}
	*/
	protected int engineSize;
	
	public Machine (int engineSize) {
		this.engineSize = engineSize;
		
		System.out.println("Constructor with parameters");
	}
	
	public void start() {
		System.out.println("I am a start method from Machine..");
	}
	
	public void restart() {
		System.out.println("Restart method from Machine class");
	}

}
