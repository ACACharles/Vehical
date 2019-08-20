class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;
	int doors;
	int tiresize;
	int year;
	int totalmiles;
	int tonage;
	int distance;
	int topspeed; 
	int speed;
	int fuellevel;
	String key; 
	String hornsound;
	String color;
	
	//This is a constructor for the minivan and sportscar. 
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
		doors = 2; 
		tiresize = 24;
		year = 2009;
		totalmiles = 110523;
		tonage = 1100; 
		color = "Very Blue";
	}
	
	//Constructor with 9 varibles
	Vehicle(int p, int f, int m, int d, int t, int y, int o, int w, String c) {
		passengers = p; 
		fuelcap =  f; 
		mpg = m; 
		doors = d;
		tiresize = t;
		year = y; 
		totalmiles = o;
		tonage = w;
		color = c;
	}
	
	//Constructor for default Vehicle. 
	Vehicle() {
		passengers = 4;
		fuelcap = 18; 
		mpg = 24;
		doors = 4; 
		tiresize = 22;
		year = 2012;
		totalmiles = 75023;
		tonage = 1600; 
		color = "Magnetic Gray";
	} 
	
	//Return the range.
	int range() {
		return mpg * fuelcap; 
	}
		
	//Compute fuel needed for a given distance.
	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}
		
	//Number of refuels needed
	int numrefill(int miles) {
		return (int) miles / range();
	}
	
	//Honking the horn with hornsound
	
	String honk() {
		return hornsound;
	}
	
		
	String forwardmotion() {
		return "accelerating"; 	
		
	}
	
	String slowdown() {
		return "breaking";
	
	}
	
	
}


class vehicleZACKERY {
	public static void main (String args[]) {
		Vehicle minivan = new Vehicle(7,16,21);
		Vehicle sportscar = new Vehicle(2,14,12);
		Vehicle Truck = new Vehicle();
		Vehicle VWthing = new Vehicle(8,10,10,4,26,1952,226758,1850,"Olive Green");
			
		double gallons;
		double refuels;
		int dist = 252;
		
		/*
		//assign valuse to fields in minivan
		minivan.passengers = 7; 
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		//assign values to fields in sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		*/
		
		//displaying minivan data
		gallons = minivan.fuelneeded(dist);
		
		refuels = minivan.numrefill(dist);
		
		System.out.println("To go " + dist + " miles the minivan needs " + gallons + " gallons of fuel.");
		
		System.out.println("To go " + dist + " miles the minivan needs " + refuels + " refuels "); 
		
		
		//displaying sportscar data
		gallons = sportscar.fuelneeded(dist);
		
		refuels = sportscar.numrefill(dist);
		
		System.out.println("To go " + dist + " miles the sportscar needs " + gallons + " gallons of fuel.");
		
		System.out.println("To go " + dist + " mile the sportscar needs " + refuels + " refuels ");
		
		
		//displaying Truck data
		gallons = Truck.fuelneeded(dist);
		
		refuels = Truck.numrefill(dist);
		
		System.out.println("To go " + dist + " miles the Truck needs " + gallons + " gallons of fuel.");
		
		System.out.println("To go " + dist + " mile the Truck needs " + refuels + " refuels ");
		
		
		//displaying VWthing data
		gallons = VWthing.fuelneeded(dist);
		
		refuels = VWthing.numrefill(dist);
		
		System.out.println("To go " + dist + " miles the VWthing needs " + gallons + " gallons of fuel.");
		
		System.out.println("To go " + dist + " mile the VWthing needs " + refuels + " refuels ");
		
		//Part A Completed 
		}
	}	
	