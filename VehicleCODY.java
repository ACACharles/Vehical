class Vehicle {

	int passengers; 
	int fuelcap;
	int mpg;
	int refuel;

Vehicle (int p, int f, int m) 
	
	{
	passengers = p;
	fuelcap = f;
	mpg = m;
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
	
	Vehicle minivan = new Vehicle(7, 16, 21);
	Vehicle sportscar = new Vehicle(2, 14, 12);
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
