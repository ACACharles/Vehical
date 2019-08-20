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
	Vehicle () {
	
	int doors = 4;
	int tireSize = 34;
	int tonage = 3500;
	int modelYear = 1964;
	int passengers = 4;
	int fuelcap = 14;
	int mpg = 6;
	int totalMiles = 3400;
	String Color = "Electric Blue";
	}
	// Constructor
	Vehicle(int d, int tS, int w, int y, int p, int f, int m, int tM, String c) 
	{
		door = d;
		tireSize = tS;
		tonage = w;
		modelYear = y;
		color = c;
		passsengers = p;
		fuelcap = f;
		mpg = m;
		totalMiles = tM; 
	}
		
	// Methods	
	int range() {
		return mpg * fuelcap;
	}
	double fuelneeded(int miles) {
		return (double) miles * mpg;
	}
	double refillneeded( int miles) {
		return miles / range() ;
	}
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
	
	jeep.passengers = 2;
	jeep.fuelcap = 12;
	jeep.mpg = 6;
	
	gallons = truck.refillneeded(dist);
	
	System.out.println("To go " + dist + " refill truck needs " +  gallons + " gallons of fuel ");
	
	gallons = jeep.refillneeded(dist);
	
	System.out.println("To go " + dist + " refill jeep needs " +  gallons + " gallons of fuel ");
	
	}
}
	
	
	
	
	
	

	
	
	
		
		
		
	

		
	
	