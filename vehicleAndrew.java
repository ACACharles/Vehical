		class Vehicle{
	
		int passengers; // How many passengers
		int fuelcap;    // fuel capacity
		int mpg ;        //miles per gallon
		int doors;      // number of doors
		String color;   // color of cords
		int tonnage;    // weight of car
		int year;       // year car made
		int mileage;
		int tiresize;
		int topspeed;
		int speed;
		String hornSound;
		int fuelLevel;
		public static String Key = "carcar";
			
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

		
		}
		
			String color(String color)
			{
				return color;
			}
			
			
			
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
		
		
		
		
		
		}
		
	
	double refill(double gallons) {
		return(double)  gallons / fuelcap;
	}	
	
	int range() {
		return(int) mpg*fuelcap;
		
	}
	
	double fuelNeeded(){
		return range()/ mpg ;
	}
	
	public String accelerate(){
		String motion = "Accelerating";
		return motion;
	}
	
	public String brakes(){
		String carBrakes = "Car is slowing down";
		return carBrakes;
	}
	
	public String honkHorn(){
		String beepHorn = "Beep Beep";
		return beepHorn;
	}
	
	public static boolean startCar(String usedKey){
		
		if (usedKey == Key)
		{
		return true; // car starts
		}
		
		else{
		return false;
		}
	}
	
		
	
	
		
	
	
	
}
//Vehicle(int p,int fc ,int mpg ,int ton,int yr,int drs,int mlg,String clr,int ts)
class vehicleAndrew{
	public static void main (String[] args){
		Vehicle sportscar = new Vehicle();
		Vehicle RangeRover = new Vehicle(5,22,12,2,2019,4,0,"black",40);
		double gallons = 21;
		int dist = 252;
		double refill;
		String Key = "carcar";
		
	
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 12;
		sportscar.mpg = 28;
		sportscar.doors = 2;
		sportscar.tonnage = 2;
		sportscar.year = 2019;
		
		
		refill = sportscar.refill(gallons);
		
		
		System.out.println(sportscar.honkHorn());
		System.out.println("You will need to refill " + refill + " times" );
		System.out.println(sportscar.accelerate());
		
		if (Vehicle.startCar(Key)){
			System.out.println("Car starts!");
		}
		else
		{
			System.out.println("Car does not start");
			
		}
	}
	
}