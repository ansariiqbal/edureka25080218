package day5; // from day6

import day6.Machine;

public class Car extends Machine {
	
	public Car(int engineSize) {
		
		super(engineSize);
		
	}

	public void restart() {
		engineSize = 9000;
		
	}
	
}

