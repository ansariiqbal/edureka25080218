package day6;

public class MSWord implements MSOffice{

	@Override
	public void save() {
		System.out.println("Save from MSWord");
		
	}

	@Override
	public void saveAs() {
		System.out.println("Save as from MSWord");
		
	}

	@Override
	public void open() {
		System.out.println("Open from MSWord");
		
	}
	
	public void resrart() {
		System.out.println("Restart from MSWord");
	}
}
