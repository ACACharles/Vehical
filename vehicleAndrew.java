class Vehicle{
	
		int passengers; // How many passengers
		int fuelcap;    // fuel capacity
		int mpg ;        //miles per gallon
		int doors;      // number of doors
		String color;   // color of cords
		int tonnage;    // weight of car
		int year;       // year car made
//		int range;	     // how m any miles per tank
			
				Vehicle()
		{		
		passengers = 2;
		fuelcap = 12;
		mpg = 28;
		doors = 2;
		tonnage = 2;
		year = 2019;
		}
	
	double refill(double gallons) {
		return (double)  gallons / fuelcap;
		
	
	
		
	
	
	}
}

class vehicleAndrew{
	public static void main (String[] args){
		Vehicle sportscar = new Vehicle();
		double gallons = 21;
		int dist = 252;
		double refill;
		
	
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 12;
		sportscar.mpg = 28;
		sportscar.doors = 2;
		sportscar.tonnage = 2;
		sportscar.year = 2019;
	//	sportscar.range = 252;
		
		refill = sportscar.refill(gallons);
		
		
		System.out.println("You will need to refill" + refill + "times" );
			
		
	}	
}