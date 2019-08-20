class Vehicle {
	
	int passengers;
	int fuelcap;
	int mpg;
	int doors;
	int tireSize;
	int tonage;
	int modelYear;
	int totalMiles;
	int topSpeed;
	int speed;
	int fuelLevel;
	String horn;
	String key;
	String color;
	
 
	
	// Constructor
	//CHARLES SAID:I would like the first 9 instance variables populated
		//CHARLES SAID: overwriting parameters with instance (you the assingment backwards)
	Vehicle (int m, int f, int p) {
		
		m = mpg;
		f = fuelcap;
		p = passengers;
	}
	
	// Constructor
	//CHARLES SAID: do not need to give data type for instance variables that are already declared
	Vehicle () {
	
	int doors = 4;
	int tireSize = 34;
	int tonage = 3500;
	int modelYear = 1964;
	int passengers = 4;
	int fuelcap = 14;
	int mpg = 12;
	int totalMiles = 3400;
	int topSpeed = 130;
	int speed = 65;
	int fuelLevel;
	String horn = "Beep";
	String key = " Remote ";
	String color = "Electric Blue";
	}
	
	// Constructor
	Vehicle(int d, int tS, int w, int y, int p, int f, int m, int tM, String c) 
	{
		doors = d;
		tireSize = tS;
		tonage = w;
		modelYear = y;
		color = c;
		passengers = p;
		fuelcap = f;
		mpg = m;
		totalMiles = tM; 
		
		
		
	}
		
	// Methods	
	int range() 
	{
		return mpg * fuelcap;
	}
	int range (int m, int fC)
	{
		return m * fC;
	} 
	////////	//CHARLES SAID: MISSING FUEL NEEDED METHODS
	double refillneeded() {
		
		int refill = totalMiles/mpg;
		return refill/fuelcap +1;
		
	}
	double refillneeded( int tM, int m, int fC) {
		int refuel = tM/m;
	return refuel/fC + 1;
	}

	public static String horn() {
		String motion = " Bang Bang........";
		return motion; }
/* CHARLES SAID

	public static String carHorn() {
		horn = " Bang Bang........";
		return horn; }	
*/	
	public static String accelerate()
	{ String motion = "Accelerating.....";
		return motion; }
		
	public static String brake()
	{ String motion = "Deer....";
		return motion; }
	
	 public boolean display(String USEDkey)
	{	
		if (USEDkey == key)
		{
			System.out.println("Engine fires up"); 
			return true;
		}
		
		else
		{	
			System.out.println ("Alarm sounds");
			return false; 
		}
		
	}
}

class VehicleBRIAN {
	
	public static void main ( String[] args) {
		Vehicle truck = new Vehicle();
		Vehicle jeep = new Vehicle();
	double gallons ;
	int tM = 252;
	
	truck.passengers = 4 ;
	truck.fuelcap = 14;
	truck.mpg = 12;
	truck.totalMiles = 465;
	
	jeep.passengers = 4;
	jeep.fuelcap = 12;
	jeep.mpg = 6;
	jeep.totalMiles = 465;
	
	gallons = truck.refillneeded();
	
	System.out.println("To go " + tM + " refill truck needs " +  gallons + " gallons of fuel ");
	
	gallons = jeep.refillneeded();
	
	System.out.println("To go " + tM + " refill jeep needs " +  gallons + " gallons of fuel ");
	
	}
}
	
	
	
	
	
	

	
	
	
		
		
		
	

		
	
	