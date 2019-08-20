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
	
	   // default constructor
		Vehicle() {
		}
		
     //constructor with 9 variables
	Vehicle(int p, int f, int m, int d, int ts, int w, int y, int tm){
		passengers = p;
		fuelcap = f;
		mpg = m;
		doors = d;
		tiresize = ts;
		weight = w;
		year = y;
		totalmiles = tm;
	}
	
		String color(String x) {
			return x;
		}
	
		int range() {	
			return mpg * fuelcap;
	    }
		double fuelneeded(int miles) {
			return(double) miles /mpg;
		}
		double refill(int miles) {
			return(double) miles / range();
		}
}
			
	class VehicleMarcus {
		public static void main(String[] args){
	    Vehicle camaro = new Vehicle(2, 14, 12, 2, 25, 3000, 2055, 5500);
		Vehicle f150 = new Vehicle(4, 20, 13, 4, 30, 5000, 1978, 100000);
		 double gallons;
		 int dist = 252;
		 String color, color1;
		 int refill, refill2;
		 int x = 666;
		 
		 
		gallons = camaro.fuelneeded(dist);
		color = camaro.color("polka dot");
		refill = (int) camaro.refill(x);
		
		
		System.out.println("To go " + dist + " miles camaro will use " + gallons + " gallons of fuel. It has a cool " + color + " color."
		+ " And to travel 666 miles, you will need to refill " + refill + " times.");
		}
	}
		
	