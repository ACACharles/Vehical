class Vehicle {
	int passengers; // number of passengers 
	int fuelcap;    // fuel capacity in gallons
	int mpg;		// fuel consumption in gallons
	int doors;      // numbers of doors
	int tiresize;  // size of tires in inches
	String color;   // color of car
	int weight;     // weight of car in lbs
	int year;       // year car was made
	int totalmiles; // mileage car has
	

		Vehicle() {
		 passengers = 4;
		 fuelcap = 20;
		 mpg = 10;
		 doors = 4;
		 tiresize = 20;
		 weight = 7000;
		 year = 2006;
		 color = "red";
		}
		
		int range() {	
			return mpg * fuelcap;
	    }
		double fueldneeded(int miles) {
			return(double) miles *mpg;
		}
		double refill(int gallonsfortrip) {
			return(double) gallonsfortrip / fuelcap;
		}
			
	class VehicleMarcus {
		public static void main(String[] args){
	    Vehicle camaro = new Vehicle();
		
		System.out.println(camaro.passengers);
		
		}
}
//No clue what else was going on
		
	