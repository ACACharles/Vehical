class Vehicle {
	
	int passengers;
	int fuelcap;
	int mpg;
	
	

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

class VehicleRefill {
	
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
	
	
	
	
	
	

	
	
	
		
		
		
	

		
	
	