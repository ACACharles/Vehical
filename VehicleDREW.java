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
	
	//This is the empty constructor
	Vehicle()
	{
		passengers=2;
		fuelCap=20;
		mpg=20;
		int doors=4;
		String color="Lime Green";
		int weight=4000;
		int year=2019;
		int totalMiles=0;
		int tireSize=40;
	}
	
	Vehicle(int p, int f, int m)
	{
		passengers=p;
		fuelCap=f;
		mpg=m;
	}
	
	//This is the constructor.
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
		int tireSize= tS;
	}
	
	int range()
	{
		return mpg * fuelCap;
	}
	
	double fuelneeded(int miles)
	{
		return (double) miles/mpg;
	}
	
	int refuel(int miles)
	{
		int x = miles/mpg;
		return x/fuelCap + 1;
	}
	
	
	int oilchange(int miles )
	{
		return miles/1000;
	}
	
}


class VehicleDREW
{
	public static void main(String[] args)
	throws java.io.IOException
	{
		Vehicle motorcycle= new Vehicle();
		Vehicle minivan = new Vehicle(7, 16, 21, 4, "Red", 2500, 2000, 50000, 40);
		Vehicle sportscar= new Vehicle(2, 14, 12, 2, "Blue", 2000, 2018, 2000, 40);
		double gallons;
		int refill;
		int dist=0;
		Scanner input = new Scanner(System.in);
		int oil;
		
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
		
		//to calculate how many gallons of fuel needed
		gallons = (int) minivan.fuelneeded(dist);
		
		System.out.println("\nTo go " + dist + " miles the minivan needs " + gallons + " gallons of fuel.\n");
		
		gallons = (int) sportscar.fuelneeded(dist);
		
		System.out.println("To go " + dist + " miles the sportscar needs " + gallons + " gallons of fuel.\n");

		//to calculate how many tims it will need to refill to complete trip.
		refill = minivan.refuel(dist);
		
		System.out.println("To go " + dist + " miles the minivan needs to refuel " + refill + " time(s).\n");
		
		refill = sportscar.refuel(dist);
		
		System.out.println("To go " + dist + " miles the sportscar needs to refuel " + refill + " time(s).\n");
		
		oil= minivan.oilchange(dist);
		
		System.out.println("To go " + dist + " miles the minivan will need " + oil + " oil change(s).\n");
		
		oil= sportscar.oilchange(dist);
		
		System.out.println("To go " + dist + " miles the sportscar will need " + oil + " oil change(s).\n");
		//Testing the empty Constructor
		System.out.println("The motorcycle has a mpg of " + motorcycle.mpg);
	}
}

//Part A completed.