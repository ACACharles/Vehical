package Vehicle;

public  class VehicleWILL {
	
	//These are variables
	int passengers; //number of passengers
	int fuelcap; //ammount of fuel vehicle can hold in gallons
	int mpg; //miles per gallon
	int doors; //number of doors
	int tiresize; //tire size
	String color; //color of vehicle
	int weight; //weight of vehicle
	int year; // year the car was made
	int totalmiles; //mileage of car
	int topspeed; //top speed of vehicle
	int speed;
	int fuellevel; 
	public static String hornsound;
	static String key = "1990";
	
	//Below is the constructor for vehicles
	VehicleWILL (int p, int f, int m, int d, int drs, int t, String c, int w, int y, int tm)
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
		VehicleWILL ( int p, int f, int m)
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
			VehicleWILL ()
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
			//overloaded range
				int range (int m, int c)
				{
					mpg = m; fuelcap = c;
					return m * c;
				}
				
				//method to compute fuel needed for given distance
					double fuelneeded (int miles) 
					{
						return (double) miles / mpg;
					}
				//overload fuelneeded
					double fuelneeded (int miles, int m)
					{
						mpg = m;
						return (double) miles / mpg; 
					}
					
					//method to compute number of times vehicle needs to refill
						int refillneeded (int miles)
						{
							return (int) 252 / mpg / fuelcap;
						}
					//overload for refill	
						int refillneeded (int miles, int c, int m)
						{
							mpg = m; fuelcap = c; 
							return (int) 252 / m / c ;
						}
						
						//horn sound
							public String honk()
							{
								return "Hoooooooonk";
							};
						//accelerate
							public String accelerate()
							{
								return "zoom zoom";
							};	
						//break
							public String brakes()
							{
								return "Initiate velocity slowing mechanism";
							};
							
						/*	// startcar
							public void startCar(String keyused)
							{
								if (Vehicle.start(key)) 
								{
									System.out.println ("Car started.");
								}
								else
									System.out.println ("Car didn't start.");
								
							};*/
							
							public static boolean start(String keyUsed)
							{
								if (keyUsed==key)
									return true;
								else
					
									return false;
							};
}


class VehConsDemo
{
	public static void main (String [] args) //construct vehicles
	
	{
		VehicleWILL minivan = new VehicleWILL (7, 16, 21);
		VehicleWILL sportscar = new VehicleWILL (2, 14, 12);
		VehicleWILL sedan = new VehicleWILL ();
		//Scanner input = new Scanner(System.in);
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
 
	System.out.println(minivan.honk());
	System.out.println(minivan.accelerate());
	System.out.println(minivan.brakes());
	//System.out.println(minivan.start());

		
			if (VehicleWILL.start(minivan.key)) 
			//{
				System.out.println ("Car started.");
			
			else
				System.out.println ("Car didn't start.");
			//}
	}
 }
