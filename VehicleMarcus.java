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
	public int topspeed;   // top speed of car
	public int speed;      // current speed of car
	int fuellevel;  // current fuel level of car
	public String horn;    // sound of horn
	public static String key = "WPS";     // the correct key to start car
	
	   // default constructor
		Vehicle() {
		}
		
     //constructor with 9 variables
	Vehicle(int p, int f, int m, int d, int ts, int w, int y, int tm, int TS){
		passengers = p;
		fuelcap = f;
		mpg = m;
		doors = d;
		tiresize = ts;
		weight = w;
		year = y;
		totalmiles = tm;
		topspeed = TS;
	}
			
        public String honkHorn() {
			String honkHorn = "*FART*! (that's my horn)";
			return honkHorn;
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
		
		
		private String accelerate() {
			String motion = "Accelerating....";   // describes behavior in a private method
			return motion;	
		}

		public void getCar() {
		 System.out.println(accelerate());
		}
		
		private String brake1(){
		String stopping= " ...Applying breaks..";
		return stopping;
 	    }
		
		public void getCar2(){
		 System.out.println(brake1());
		}
		
		
	    public static boolean startCar(String usedKey) {
			
			if (usedKey == key)
				return true; // car starts
			
			else
				return false;
			}
}
			
	class VehicleMarcus {
		public static void main(String[] args){
	    Vehicle camaro = new Vehicle(2, 14, 12, 2, 25, 3000, 2055, 5500, 140);
		Vehicle f150 = new Vehicle(4, 20, 13, 4, 30, 5000, 1978, 100000, 85);
		 double gallons;
		 int dist = 252;
		 String color, color1;
		 int refill, refill2;
		 int x = 666;
		 String honk;
		 String key = "WPS";
		 int TS = 140;
		
		
	    honk = camaro.honkHorn();
		gallons = camaro.fuelneeded(dist);
		color = camaro.color("polka dot");
		refill = (int) camaro.refill(x);

		
		
		{
		if (Vehicle.startCar(key))
		    System.out.println("Car is started");
		else 
			System.out.println("Wrong key, car didnt start");
		}
				camaro.getCar();                // statement that calls upon the other public method of the CAR class to retrieve stored attribute
	
		System.out.println("To go " + dist + " miles camaro will use " + gallons + " gallons of fuel. It has a cool " + color + " color."
		+ " And to travel 666 miles, you will need to refill " + refill + " times." + "\n" + honk + "\n" + " Oh, did I mention it has a top speed of " + TS +"?" 
		+ " because it does.");
				
				camaro.getCar2();
		}
	}
		
	