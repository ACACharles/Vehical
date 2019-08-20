import java.util.Scanner;
class Vehicle {

	int passengers; 
	int fuelcap;
	int mpg;
	int doors;
	int tiresize;
	int weight;
	int year;
	int totalMiles;
	int color;

	// This is the default constructor
Vehicle() 
	{
	passengers = 4;
	fuelcap =  350;
	mpg = 30;
	}
	
Vehicle (int p, int f, int m) 
	// This the constructor
	int refuel;
	
Vehicle (int p, int f, int m, int d, int t, int w, int y, int tm,int c)
	{
	passengers = p;
	fuelcap =  f;
	mpg = m;
	doors = d;
	tiresize = t;
	weight = w;
	year = y;
	totalMiles = tm;
	color = c;
	}
	
	
	
	}
	
	 int range() 
	 {
	 return mpg *fuelcap;
	 }
	 double fuelneeded (int miles)
	 {
	 return (double) miles / mpg;
	 }
	  double refuel (int miles)
	 {
	 return (double) miles / (mpg * fuelcap);
	 }
}
class VehicleCody {
	public static void main (String[] args) {
	
	Vehicle default1 = new Vehicle();	
	System.out.println(" Default vehicle specs " + " Passenger: " + default1.passengers + " Fuelcap: " + default1.fuelcap + " Mpg: " + default1.mpg);
	
	
	System.out.println(" Please enter passenger number, fuelcap, and mpg");
	Scanner specs = new Scanner(System.in);
	int p = specs.nextInt();
	int f = specs.nextInt();
	int m = specs.nextInt();
	Vehicle minivan = new Vehicle(p, f, m);
	
	
	System.out.println(" Please enter passenger number, fuelcap, and mpg");
	p = specs.nextInt();
	f = specs.nextInt();
	m = specs.nextInt();
	Vehicle sportscar = new Vehicle(p, f, m);
	double gallons;
	double refillnumber;
	int dist = 252;
	
	
	
	gallons = minivan.fuelneeded(dist);
	
	System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel. ");
	
	gallons = sportscar.fuelneeded(dist);
	
	System.out.println ("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel. ");
	
	gallons = minivan.fuelneeded(dist);
	
	System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
	
	System.out.println ("To go " + dist + " You will use up " + minivan.refuel(dist) + " of tank.");
	
	System.out.println ("To go " + dist + " You will use up " + sportscar.refuel(dist) + " of tank.");
	}
}
