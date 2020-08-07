package fundamentals;

public class Vehicle {

	public static void main(String[] args) {
			RetMeth minivan=new RetMeth();
			RetMeth jeep=new RetMeth();
			
			minivan.passengers=8;
			minivan.fuel=12;
			minivan.mil=42;
			jeep.passengers=6;
			jeep.fuel=12;
			jeep.mil=23;
			
			
			int range1, range2;
			
			range2=jeep.range();
			
			
			
			System.out.println("Minivan's capacity is "+minivan.passengers + " and mileage is "+minivan.range());
			System.out.println("Jeep's capacity is "+jeep.passengers + " and mileage is "+range2);
	}

}
