package day6;

public class DemoMSOffice {

	public static void main(String[] args) {


		MSExcel excel = new MSExcel();
		
		excel.open();
		excel.save();
		System.out.println("-------------------------");
		
		MSWord word = new MSWord();
		
		word.save();
		word.saveAs();
		word.resrart();

	}

}
