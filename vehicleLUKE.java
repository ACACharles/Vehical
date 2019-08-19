class Vehicle
{
		int passengers; // number of passengers
		int fuelcap; // fuel capacity in gallons
		int mpg; // fuel consumption in miles per gallon
		//int doors; // number of doors 
		//int tireSize; // Size of tires
		//int weight; // weight of vehicle tons
		//int year; // year model
		//int totalmiles; // total miles on vehicle 
		int refuel;
		//String color;  color of vehicle
			
		
		// This is a constructor for Vehicle.
			Vehicle(int p, int f, int m) 
			{
			passengers = p;
			fuelcap = f;
			mpg = m; 
		}
			Vehicle() {
			passengers = 4;
			fuelcap = 18;
			mpg =  	8;
			}
				// Return the range.
				int range() {
					return mpg * fuelcap;
		}
		// Compute fuel needed for a given distance. 
		
		double fuelneeded (int miles) 
		{
			return (double) miles / mpg ;
		}
				
				double refuel (int miles)
				{
			return (double) miles / (mpg * fuelcap) ; 
		}
		
		 
		
	}
	class vehicleLUKE {
		public static void main (String [] args) {
			// construct complete vehicles
			Vehicle minivan = new Vehicle() ;
			Vehicle sportscar = new Vehicle () ;
			
			double gallons;
			double refillnumber;
			int dist = 252; 
			gallons = minivan.fuelneeded(dist); 
			
			System.out.println(" to go "  +  dist  +  " miles minivan needs " +  gallons +  " gallons of fuel. ");
			
			gallons = sportscar.fuelneeded(dist);
			
			System.out.println(" To go " + dist +  " miles sportscar needs " +  gallons + " gallons of fuel. ") ;
			
			gallons = minivan.fuelneeded(dist); 
			
			System.out.println (" To go " + dist  + " the minivan will use up " +  minivan.refuel(dist) + " of tank." );
			
			System.out.println (" To go " + dist  + " the sportscar will use up " +  sportscar.refuel(dist) + " of tank.") ;
			 
		
				}
			
			}
			
			
			
			