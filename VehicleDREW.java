import java.util.Scanner;

class Vehicle
{
	//These are the instance variables
	int passengers;
	int fuelCap;
	int mpg;
	int doors;
	String color;
	int weight;
	int year;
	int totalMiles;
	int tireSize;
	
	public int topSpeed;
	public int CurrSpeed;
	public static String hornSound="Toot Toot";
	public static String key ="123456";
	public String fuelLevel;
	
	//			   |
	//			   |
	//Constructors V
	Vehicle()
	{
		passengers=2;
		fuelCap=20;
		mpg=20;
		doors=4;
		color="Lime Green";
		weight=4000;
		year=2019;
		totalMiles=0;
		tireSize=40;
	}
	
	Vehicle(int p, int f, int m)
	{
		passengers=p;
		fuelCap=f;
		mpg=m;
		doors=2;
		color="Silver";
		weight=3500;
		year=2019;
		totalMiles=0;
		tireSize=40;		
	}
	
	Vehicle(int p, int f, int m, int d, String c, int w, int y, int tM, int tS)
	{
		passengers = p;
		fuelCap = f;
		mpg = m;
		doors = d;
		color = c;
		weight = w;
		year = y;
		totalMiles=tM;
		tireSize= tS;
	}
	//Construtors ^
	//			  |
	//			  |
	
	//Method to find the range
	int range()
	{
		return mpg * fuelCap;
	}
	
	//Overloaded method to find the range
	int range(int m, int fC)
	{
		return m * fC;
	}
	
	//Method to find the fuel needed for how long the journey is
	double fuelneeded(int miles)
	{
		return miles/mpg;
	}
	
	//Overloaded method to find the fuel needed for how long the journey is
	double fuelneeded (int miles, int mp)
	{ 
		return miles/mp;
	}
	
	//Overloaded method to find how many refuels will be needed based on the journey length and the mpg
	int refuel (int miles, int mp, int fC)
	{
		int x = miles/mp;
		return x/fC+1;
	}
	
	//Method to find how many refuels will be needed based on the journey length and the mpg
	int refuel(int miles)
	{
		return miles/fuelCap + 1;
	}
	
	//Method to find how many oil changes will be needed based on the journey length
	int oilchange(int miles)
	{
		return miles/1000;
	}
	
	//Method to honk the hornSound
	public static String honkHorn()
	{	
		return hornSound;
	}
	
	//Method to accelerate the vehicle
	public static String move()
	{
		String motion="Accelerating...";
		return motion;
	}
	
	//Method to slow down the car
	public static String stop()
	{
		String slowMotion="Slowing down.";
		return slowMotion;
	}
	
	//Method to start the car
	public static boolean start(String keyUsed)
	{
		if (keyUsed==key)
			return true;
		else
			return false;
	}
	
	public void setVehicle(String a, String b, int c, int d, String e)
	{
		key=a;
		hornSound=b;
		topSpeed=c;
		CurrSpeed=d;
		fuelLevel=e;
	}
	
	public void getVehicle()
	{
		System.out.println(key+" " +hornSound + " "+ topSpeed + " " + CurrSpeed+ " " + fuelLevel);
	}
	
}


class VehicleDREW
{
	public static void main(String[] args)
	throws java.io.IOException
	{
		Scanner input = new Scanner(System.in);
		Vehicle motorcycle= new Vehicle();
		Vehicle corvette= new Vehicle(2, 15, 20);
		Vehicle minivan = new Vehicle(7, 16, 21, 4, "Red", 2500, 2000, 50000, 40);
		Vehicle sportscar= new Vehicle(2, 14, 12, 2, "Blue", 2000, 2018, 2000, 40);
		double gallons;
		int refill;
		int dist=0;
		int oil;
		String key="123456";
		/*
		System.out.print("\nHow many miles do you want to travel? Please enter here: ");
		
		one: if (input.hasNextInt())
		{
			dist = input.nextInt();
		}
		else
		{	
		System.out.println("That is not a number, try again: ");
		 break one;
		}
		
		gallons = minivan.fuelneeded(dist);
		System.out.println("\nTo go " + dist + " miles the minivan needs " + gallons + " gallons of fuel.\n");

		gallons = sportscar.fuelneeded(dist);		
		System.out.println("To go " + dist + " miles the sportscar needs " + gallons + " gallons of fuel.\n");

		refill = minivan.refuel(dist);
		System.out.println("To go " + dist + " miles the minivan needs to refuel " + refill + " time(s).\n");
		
		refill = sportscar.refuel(dist);
		System.out.println("To go " + dist + " miles the sportscar needs to refuel " + refill + " time(s).\n");
		
		oil= minivan.oilchange(dist);
		System.out.println("To go " + dist + " miles the minivan will need " + oil + " oil change(s).\n");

		oil= sportscar.oilchange(dist);		
		System.out.println("To go " + dist + " miles the sportscar will need " + oil + " oil change(s).\n");
		
		//Testing the empty Constructor
		System.out.println("The motorcycle has a mpg of " + motorcycle.mpg + "\n");
		
		//Testing the constructor with 3 variables passed in
		gallons = (int) corvette.fuelneeded(dist);
		System.out.println("To go " + dist + " miles the corvette needs " + gallons + " gallons of fuel.\n");
		System.out.println("The corvette is the color " + corvette.color + "\n");
		*/
		
		//test the start method
		if (Vehicle.start(key))
			System.out.println("Car is started");
		else 
			System.out.println("Wrong key, car didnt start");
		
		//Testing horn
		System.out.println(Vehicle.honkHorn());
		
		//Testing setVehicle and getVehicle
		Vehicle testVehicle=new Vehicle();
		testVehicle.setVehicle("123456", "Hoot", 120, 0, "Full");
		testVehicle.getVehicle();
	}
}

//Part A completed.
//Part B plus bonus completed. 