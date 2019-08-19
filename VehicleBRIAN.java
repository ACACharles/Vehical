class Vehicle {
	
	int passengers;
	int fuelcap;
	int mpg;
	int doors;
	int tireSize;
	int tonage;
	int modelYear;
	int dist;
	String color;
	
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}	
	Vehicle () {
	
	int doors = 4;
	int tiresize = 34;
	int tonage = 3500;
	int modelYear = 1964;
	String Color = "Electric Blue";
			
		
	}	
	
	
	
	

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
	
	
	
	
	
	

	
	
	
		
		
		
	

		
	
	