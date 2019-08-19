class VehicleKori {
	int passengers;
	int fuelcap;
	int mpg; 
	int doors;
	int tonage; 
	int year;
	int totalmiles;
	int wheelsize; 

	VehicleKori(){}

	VehicleKori(int p, int f, int m, int d, int t, int y, int tm, int ts){
		passengers = p;
		fuelcap = f;
		mpg = m;
		doors = d;
		tonage = t;
		year = y;
		totalmiles = tm;
		wheelsize = ts;
	}
	
	//gasrefill
	double gasrefill (int dist) {
		return (int) dist / range() + 1;
	}
	
	//return the color
	String color (String x) {
		return x;
	}

	//return the range
	int range() {
		return mpg * fuelcap;
	}

	//compute fuel to travel a specific distance
	double fuelneeded(int miles) {
		return (double) miles/mpg;
	}
}

class VehConsDemo {
	public static void main(String[] args) {

		//construct complete vehicle
		// passengers, fuelcap, mpg, doors, tonage, year, totalmiles, wheelsize
		VehicleKori minivan = new VehicleKori(7, 16, 21, 5, 2, 2005, 250, 16);
		VehicleKori sportscar = new VehicleKori(2, 14, 12, 2, 1, 2019, 50, 20);
		double gallons;
		String color, color2;
		int dist = 252;
		int refill, refill2;
		int x = 500;

		gallons = minivan.fuelneeded(dist);
		color = minivan.color("blue");
		refill = (int) minivan.gasrefill(x);

		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel. The color of "
				+ "the vehicle is " + color + ". The amount of refills to drive 500 miles is " + refill);

		gallons = sportscar.fuelneeded(dist);
		color2 = sportscar.color("red");
		refill2 = (int) sportscar.gasrefill(x);

		System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel. The color of "
				+ "the vehicle is " + color2 + ". The amount of refills to drive 500 miles is " + refill2);
	}
}
