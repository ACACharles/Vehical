class Vehicle{
	
		int passengers; // How many passengers
		int fuelcap;    // fuel capacity
		int mpg ;        //miles per gallon
		int doors;      // number of doors
		String color;   // color of cords
		int tonnage;    // weight of car
		int year;       // year car made
		int range = fuelcap*mpg;
		int mileage;// how many miles per tank
		int tiresize;
			
			
			Vehicle()
		{		
		passengers = 2;
		fuelcap = 12;
		mpg = 28;
		doors = 2;
		tonnage = 2;
		year = 2019;
		tiresize = 35 ;
		mileage = 0;
		color = "Blue";
		range = fuelcap*mpg;
		}
		
			/*String color(String color)
			{
				return color;
			}
			int range()
			{
			return mpg * fuelcap;	
			} */
			
			
			Vehicle (int p, int fc,int mpg)
		{
		passengers = p;
		fuelcap = fc;
		mpg = mpg;
		doors = 2;
		tonnage = 2;
		year = 2019;
		tiresize = 35 ;
		mileage = 0;
		color = "Blue";
		range = fuelcap*mpg;
		
		}
				
				
			Vehicle(int p,int fc ,int mpg ,int ton,int yr,int drs,int mlg,String clr,int ts)
		{
		
		passengers = p;
		fuelcap = fc;
		mpg = mpg;
		doors = drs;
		tonnage = ton;
		year = yr;
		tiresize = ts ;
		mileage = 0;
		color = clr;
		range = fuelcap*mpg;
		
		
		
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
		sportscar.range = 252;
		
		refill = sportscar.refill(gallons);
		
		
		System.out.println("You will need to refill" + refill + "times" );
			
		
	}	
}