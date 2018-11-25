package day6;

public class DemoShape {

	public static void main(String[] args) {

		Cuboid cuboid = new Cuboid();
		
		double vol = cuboid.calculateVolume(90, 10);
	
		System.out.println("Cuboid Volume : " + vol);

		System.out.println("----------------------------------");
		
		Cylinder cyl = new Cylinder();
		
		vol = cyl.calculateVolume(90, 10);
		
		System.out.println("Cylinder Volume : " + vol);

		System.out.println("----------------------------------");
		
	}
}
