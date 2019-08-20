class Vehicle
{
		int passengers; // number of passengers
		 int fuelcap; // fuel capacity in gallons
		  int mpg; // fuel consumption in miles per gallon
		   int doors; // number of doors 
		    int tireSize; // Size of tires
		   int weight; // weight of vehicle tons
		  int year; // year model
		 int totalmiles; // total miles on vehicle 
		int refuel;
	   String color = "matte grey" ;
			
		
		// This is a constructor for Vehicle.
			Vehicle(int p, int f, int m) 
			 {
			  passengers = p;
			   fuelcap = f;
			    mpg = m;
				doors = 4;
			   tireSize = 33;
			  weight = 3600;
			year = 2015;
		   totalmiles = 8;
		  color = "matte grey" ;
				
			 }
			 
		// This is the no parameter constructor 	   
			   Vehicle() {
			  passengers = 1;
			 fuelcap = 5;
			mpg =  	21;
		   doors = 4 ;
		    tireSize = 33;
		     weight = 3600;
			  year = 2015 ;
			   totalmiles = 8;
			    color = "matte grey";
			
			}
	
		// 9 parameter constructor 
		
			Vehicle( int d, int t, int w, int y, int z, String c, int p, int f, int m)
			{
				doors = d ;
				 tireSize = t;
				  weight = w;
				   year = y;
				  totalmiles = z;
				color = c;
				passengers = p;
			   fuelcap = f;
			  mpg = m;
			
				
					d = 4;
					 t = 33;
					  w = 3600;
					   y = 2015;
						z = 8;
						 c = "matte grey" ;
						  p = 4;
						   f = 18;
						    m = 21;
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
			
			
			
			