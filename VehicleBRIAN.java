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
	
	{
	passengers = p;
	fuelcap = fC;
	mpg = m;
	doors = d;
	tiresize = tS;
	tonage = t;
	modelYear = y;
	total miles = tM;
	topSpeed = tS;
	speed = s;
	fuelLevel = fL;
	color = c;
	horn = h;
	key = k;
	}
	
	Vehicle () 
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
	int range (int m, int fC)
	{	
	return m * fC;
	}
	
	//Overloaded Range
	int range (int m, int c)
	{
	mpg = m; fuelcap = c;
	return m * c;
	}
	
	double fuelneeded(int miles) 
	{
	return (double) miles * mpg;
	}
	
	//Overloaded Fuel Needed
	double fuelneeded (int miles, int m)
	{
	mpg = m;
	return (double) miles / mpg; 
	}
	
	double refillneeded( int miles) 
	{
		return miles / range() ;
	}
	
	// Overloaded Refill Needed
	int refillneeded (int miles, int c, int m)
	{
	mpg = m; fuelcap = c; 
	return (int) 252 / m / c ;
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
	int dist = 252;
	
	truck.passengers = 4 ;
	truck.fuelcap = 14;
	truck.mpg = 12;
	
	jeep.passengers = 2;
	jeep.fuelcap = 12;
	jeep.mpg = 6;
	
	gallons = truck.refillneeded(dist);
	
	System.out.println("To go " + dist + " refill truck needs " +  gallons + " gallons of fuel ");
	
	gallons = jeep.refillneeded(dist);
	
	System.out.println("To go " + dist + " refill jeep needs " +  gallons + " gallons of fuel ");
	
	}
}
	
	
	
	
	
	

	
	
	
		
		
		
	

		
	
	