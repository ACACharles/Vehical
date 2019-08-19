class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;
	int doors;
	int tires;
	int year;
	int totalmiles;
	int tonage;
	int distance;
	
	String color;
	
	//This is a constructor for the Vehicle.
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
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
}

class vehdemo {
	public static void main (String args[]) {
		Vehicle minivan = new Vehicle(7,16,21);
		Vehicle sportscar = new Vehicle(2,14,12);
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
		
		
		
		}
	}

		
	