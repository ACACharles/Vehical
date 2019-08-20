class Vehicle 
{
	int passengers; //number of passengers
	int fuelcap; //ammount of fuel vehicle can hold in gallons
	int mpg; //miles per gallon
	int doors; //number of doors
	int tiresize; //tire size
	String color; //color of vehicle
	int weight; //weight of vehicle
	int year; // year the car was made
	int totalmiles; //mileage of car
	
//Below is the constructor for vehicles
	Vehicle (int p, int f, int m, int d, int drs, int t, String c, int w, int y, int tm)
	{
		passengers = p;
		fuelcap = f;
		mpg = m;
		doors = drs;
		tiresize = t;
		color = c;
		weight = w;
		year = y;
		totalmiles = tm;
	}
	// Constructor with 3 parameters
		Vehicle ( int p, int f, int m)
		{
			passengers = p;
			fuelcap = f;
			mpg = m;
			doors = 4;
			tiresize = 56;
			color = "blue";
			weight = 5000 ;
			year = 2009;
			totalmiles = 50000;
		}
		//Constructor for when values aren't assigned
			Vehicle ()
			{
				passengers = 4 ;
				fuelcap = 12 ;
				mpg = 23 ; 
				doors = 4;
				tiresize = 56 ;
				color = "blue" ;
				weight = 5000;
				year = 2009 ;
				totalmiles = 50000;
			}
			
			//method to return the range
				int range (int range)
				{
					return mpg * fuelcap;
				}
				
				//method to compute fuel needed for given distance
					double fuelneeded (int miles) 
					{
						return (double) miles / mpg;
					}
					
					//method to compute number of times vehicle needs to refill
						int refillneeded (int miles)
						{
							return (int) 252 / mpg / fuelcap;
						}
}

class VehConsDemo
{
	public static void main (String [] args) //construct vehicles
	{
		Vehicle minivan = new Vehicle (7, 16, 21);
		Vehicle sportscar = new Vehicle (2, 14, 12);
		Vehicle sedan = new Vehicle ();
		double gallons;
		double gasrefill;
		int dist = 252;
	
	gallons = minivan.fuelneeded (dist);
	gasrefill = minivan.refillneeded (dist);
	System.out.println ("To go " + dist + " miles the minivan needs " + gallons + " gallons of fuel. They will need to refuel " + gasrefill + " times.");
	
	gallons = sportscar.fuelneeded (dist);
	gasrefill = sportscar.refillneeded (dist);
	System.out.println ("To go " + dist + " miles the sportscar needs " + gallons + " gallons of fuel. They will need to refuel " + gasrefill + " times.");
   
	gallons = sedan.fuelneeded (dist);
	gasrefill = sedan.refillneeded (dist);
	System.out.println ("To go " + dist + " miles the sedan needs " + gallons + "gallons of fuel. They will need to refuel " + gasrefill + " times.");
   }
}