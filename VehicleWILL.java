class Vehicle 
{
	int passengers; //number of passengers
	int fuelcap; //ammount of fuel vehicle can hold in gallons
	int mpg; //miles per gallon
	int distance; //miles traveled
	
//Below is the constructor for vehicals
	Vehicle (int p, int f, int m, int d)
	{
		passengers = p;
		mpg = m;
		fuelcap = f;
		distance = d;
	}
	
	//return the range
		int range (int range)
		{
			return mpg * fuelcap;
		}
		
		//compute fuel needed for given distance
			double fuelneeded (int miles) 
			{
				return (double) miles / mpg;
			}
			
			//number of times vehicle needs to refill
				int refillneeded (int miles)
				{
					return (int) distance / mpg / fuelcap;
				}
}

class VehConsDemo
{
	public static void main (String [] args) //construct vehicles
	{
		Vehicle minivan = new Vehicle (7, 16, 21, 252);
		Vehicle sportscar = new Vehicle (2, 14, 12, 252);
		double gallons;
		double gasrefill;
		int dist = 252;
	
	gallons = minivan.fuelneeded (dist);
	gasrefill = minivan.refillneeded (dist);
	System.out.println ("To go " + dist + " miles the minivan needs " + gallons + " gallons of fuel. They will need to refuel " + gasrefill + " times.");
	
	gallons = sportscar.fuelneeded (dist);
	gasrefill = sportscar.refillneeded (dist);
	System.out.println ("To go " + dist + " miles the sportscar needs " + gallons + " gallons of fuel. They will need to refuel " + gasrefill + " times.");
    }
}