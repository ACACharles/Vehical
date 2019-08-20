class Vehicle {
	
	int passengers;
	int fuelcap;
	int mpg;
	int doors;
	int tireSize;
	int tonage;
	int modelYear;
	int totalMiles;
	
	String color; 
	
	// Constructor
	Vehicle (int m, int f, int p) {
		m = mpg;
		f = fuelcap;
		p = passengers;
	}
	
	// Constructor
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
	int fuelLevel
	String Horn = "Beep";
	String Key = " Remote ";
	String Color = "Electric Blue";
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
		topSpeed = tS;
		speed =s;
		fuelLevel = fL;
		horn = h;
		key = k;
		
		
	}
		
	// Methods	
	int range(int m, int f) {
		return mpg * fuelcap;
	}
	double fuelneeded(int tM, int m) {
		return (double) miles * mpg;
	}
	double refillneeded( int tM, int r) {
		return miles / range() ;
	}

	public static String accelerate() {
		String motion = " Bang Bang........";
		return motion; }
	
	
	public static String accelerate()
	{ String motion = "Accelerating.....";
		return motion ; }
		
	public static String brake()
	{ String motion = "Deer....";
	return motion ; }
	
	static void display(boolean USEDkey)
	{	if (USEDkey == key);
		System.out.println(" Engine fires up."); }
			return true:
		{
			else
		}
	{	System.out.println (" Alarm sounds.");
			return false; }
		
	
}

class VehicleBRIAN {
	
	public static void main ( String[] args) {
		Vehicle truck = new Vehicle();
		Vehicle jeep = new Vehicle();
	double gallons ;
	int dist = 252;
	
	truck.passengers = 4 ;
	truck.fuelcap = 14;
	truck.mpg = 12;
	
	jeep.passengers = 4;
	jeep.fuelcap = 12;
	jeep.mpg = 6;
	
	gallons = truck.refillneeded(dist);
	
	System.out.println("To go " + dist + " refill truck needs " +  gallons + " gallons of fuel ");
	
	gallons = jeep.refillneeded(dist);
	
	System.out.println("To go " + dist + " refill jeep needs " +  gallons + " gallons of fuel ");
	
	}
}
	
	
	
	
	
	

	
	
	
		
		
		
	

		
	
	