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
	String color;
	int topSpeed;
	int speed;
	int fuelLevel;
	String hornSound;
	String key;
	
	int refuel;
	
	
    

	
Vehicle() // This is the default constructor "method" 
	{
	passengers = 4;
	fuelcap =  350;
	mpg = 30;
	doors = 4;
	tiresize = 20;
	weight = 2500;
	year = 2019;
	totalMiles = 600;
	color = "blue";
	
	}
		
	
Vehicle (int p, int f, int m) // This is a constructor
	{
	passengers = p;
	fuelcap =  f;
	mpg = m;
	doors = 4;
	tiresize = 20;
	weight = 2500;
	year = 2019;
	totalMiles = 600;
	color = "blue";
	
	}
	   

	
Vehicle (int p, int f, int m, int d, int t, int w, int y, int tm, String c) // This is a constructor
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
	
	
	
	
	 public boolean startCar(String newKey) //This is a method that has a boolean in it. 
	 {
		if (newKey == key)
		{
			System.out.println("Key match, vehicle starts."); 
			return true;
		}
	    else 
	    {
			System.out.println("Key doesn't match, vehicle does not starts.");
			return false;
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
	 
	 
	 
	 
	 String honk()
	 {
		String honk= "Beep Beep";
		return honk;
	 }
	 
	 
	 
	 String motion()
	 {
		String motion= "Accelerating...";
		return motion;
	 }
	 
	 
	 
	 String brake1 ()
	 {
		String brake1= "Applying breaks";
		return brake1;
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
