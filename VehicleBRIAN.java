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
	
	Vehicle (int p, int fC, int m, int d, int tS, int t, int y, int tM, int mph, int s, int fL, String c, String h, String k)
	{
	passengers = p;
	fuelcap = fC;
	mpg = m;
	doors = d;
	tireSize = tS;
	tonage = t;
	modelYear = y;
	totalMiles = tM;
	topSpeed = tS;
	speed = s;
	fuelLevel = fL;
	color = c;
	horn = h;
	key = k;
	}
	
	Vehicle (int p, int m, int fC) 
	
	{
	doors = 4;
	tireSize = 34;
	tonage = 3500;
	modelYear = 1964;
	passengers = p;
	fuelcap = fC;
	mpg = m;
	totalMiles = 3400;
	topSpeed = 130;
	speed = 65;
	horn = "Beep";
	key = " Remote ";
	color = "Electric Blue";
	}
	
	Vehicle()
	{
	doors = 4;
	tireSize = 34;
	tonage = 3500;
	modelYear = 1964;
	passengers = 4;
	fuelcap = 14;
	mpg = 12;
	totalMiles = 3400;
	topSpeed = 130;
	speed = 65;
	horn = "Beep";
	key = " Remote ";
	color = "Electric Blue";
	}

	int range() {
	return mpg * fuelcap;
	}
	
	
	//Overloaded Range
	int range (int m, int fC)
	{
	mpg = m; fuelcap = fC;
	return m * fC;
	}
	
	double fuelneeded(int tM) 
	{
	return (double) totalMiles * mpg;
	}
	
	//Overloaded Fuel Needed
	double fuelneeded (int tM, int m)
	{
	mpg = m;
	return (double) tM / m; 
	}
	
	double refillneeded( int tM) 
	{
		return tM / range();
	}
	
	// Overloaded Refill Needed
	int refillneeded (int tM, int fC, int m)
	{
	mpg = m; fuelcap = fC; 
	return (int) 252 / m / fC+1 ;
	}
	
	
	
	public static String carhorn() 
	{
	String carhorn = " honk honk........";
		return carhorn; 
	}

	public static String accelerate()
	{ 
	
	String motion = "Accelerating.....";
		return motion; 
	}
		
	public static String brake()
	{ 
	
	String brake = "Brake Check....";
		return brake; 
	}
	
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

class VehicleBRIAN{
	
	public static void main ( String[] args) {
		Vehicle truck = new Vehicle();
		Vehicle jeep = new Vehicle();
	double gallons ;
	int tM = 252;
	
	truck.passengers = 4 ;
	truck.fuelcap = 14;
	truck.mpg = 12;
	
	jeep.passengers = 2;
	jeep.fuelcap = 12;
	jeep.mpg = 6;
	
	gallons = truck.refillneeded(tM);
	
	System.out.println("To go " + tM + " refill truck needs " +  gallons + " gallons of fuel ");
	
	gallons = jeep.refillneeded(tM);
	
	System.out.println("To go " + tM + " refill jeep needs " +  gallons + " gallons of fuel ");
	
	}
}
	
	
	
	
	
	

	
	
	
		
		
		
	

		
	
	