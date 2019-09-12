package VehiclePack;

//this is my vehicle class where I state all my variables

abstract class Vehicle {

	int passengers;
	int fuelcap;
	int mpg;
	int doors;
	int tiresize;
	int weight;
	int year;
	int totalMiles;
	int topSpeed;
	int speed;
	int fuelLevel;
	int refuel;
	int key = 1234;
	String color;

	/*
	 * This is the default constructor. Charles mentioned that these can also be
	 * referred as a "constructor method", because it's technically a method as well
	 * as a constructor.
	 */
	Vehicle() {
		passengers = 4;
		fuelcap = 350;
		mpg = 30;
		doors = 4;
		tiresize = 20;
		weight = 2500;
		year = 2019;
		totalMiles = 600;
		color = "blue";
	}

	// This is a constructor with 3 assignable variables
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
		doors = 4;
		tiresize = 20;
		weight = 2500;
		year = 2019;
		totalMiles = 600;
		color = "blue";
	}

	// This is a constructor with all assignable variables
	Vehicle(int p, int f, int m, int d, int t, int w, int y, int tm, String c) {
		passengers = p;
		fuelcap = f;
		mpg = m;
		doors = d;
		tiresize = t;
		weight = w;
		year = y;
		totalMiles = tm;
		color = c;
	}

	abstract void getMakeAndModel();{
		
	}

	//start car method
	public boolean startCar(int newKey) // This is a method that is looking for a boolean value to return true or false.
	{

		if (newKey == key) {
			System.out.println("Key match, vehicle starts.");
			return true;
		} else {
			System.out.println("Key doesn't match, vehicle does not start.");
			return false;
		}
	}

//method to return the range 
	int range() // This is a method that will calculate the range for each created vehicle

	{
		return mpg * fuelcap;
	}

	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}

	double refuel(int miles) {
		return (double) miles / (mpg * fuelcap);
	}

	
//honk method
	String honk() // This is a method
	{
		String honk = "Beep Beep";
		return honk;
	}

//motion method
	String motion() // This is a method
	{
		String motion = "Accelerating";
		return motion;
	}
	
//brake method
	String brake1() // This is a method
	{
		String brake1 = "Applying breaks";
		return brake1;
	}

}
