package gui;

public class CarDesign {
	
//	String name;
//	int passengers = 0;
//	int fuelcap = 0;
//	int mpg = 0; 
//	int doors = 0;
//	int tonage = 0; 
//	int year = 0;
//	int totalmiles = 0;
//	int wheelsize = 0; 
//	int color;
//	int range;
//	int gaslvl;
//	int cleandirty;

	public static void minivan(String name) {
		
		new CarFactory(name, 8, 21, 19, 5, 2, 2005, 150000, 17, 1, 400, 75, 10);
	}

	public static void sportsCar(String name) {
		
		new CarFactory(name, 2, 14, 25, 2, 1, 2013, 60000, 18, 2, 350, 25, 3);
	}

	public static void customCar(String name) {
		// TODO Auto-generated method stub
		
	}
	
}
