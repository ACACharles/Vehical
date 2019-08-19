import java.util.Scanner;

class Vehicle
{
	int passengers;
	int fuelcap;
	int mpg;
	/*
	int doors;
	String color;
	int weight;
	int year;
	int totalMiles;
	*/
	
	//This is the constructor.
	Vehicle(int p, int f, int m /*, int d, String c, int w, int y, int tM*/)
	{
		passengers = p;
		fuelcap = f;
		mpg = m;
		/*
		doors = d;
		color = c;
		weight = w;
		year = y;
		totalMiles=tM
		*/
	}
	
	int range()
	{
		return mpg * fuelcap;
	}
	
	double fuelneeded(int miles)
	{
		return (double) miles/mpg;
	}
	
	int refuel(int miles)
	{
		int x = miles/mpg;
		return x/fuelcap + 1;
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
		Vehicle minivan = new Vehicle(7, 16, 21);
		Vehicle sportscar= new Vehicle(2, 14, 12);
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
		gallons = minivan.fuelneeded(dist);
		
		System.out.println("\nTo go " + dist + " miles the minivan needs " + gallons + " gallons of fuel.\n");
		
		gallons = sportscar.fuelneeded(dist);
		
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
	}
}