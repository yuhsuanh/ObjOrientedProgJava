package pers.gc.copr;

public class CarTester {
	
	public static void main(String[] args) {
		//Instantiate car1 and car2
		Car car1 = new Car("Tesla", "Model X", "2018", "1HGBH41JXMN109186");
		Car car2 = new Car("Subaru", "Outback", "2019", "6EATT", "Black", "TR690", "1G1YZ23J9P5803427", 29295.98);
		
		//Display car 1
		System.out.println("-----Car 1-----");
		System.out.println(car1);
		
		System.out.println();
		
		//Display car 2
		System.out.println("-----Car 2-----");
		System.out.println(car2);
	}

}
