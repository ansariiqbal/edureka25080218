package day6;

public class MSExcel implements MSOffice{

	@Override
	public void save() {
		System.out.println("Save from MSExcel");
		
	}

	@Override
	public void saveAs() {
		System.out.println("Save as from MSExcel");
		
	}

	@Override
	public void open() {
		System.out.println("Open from MSExcel");
		
	}

}
