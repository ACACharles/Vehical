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
	   int fuelLevel ; // 
	   int topSpeed; 
	    int speed ; 
	   String color = "matte grey" ;
	   String hornSound = " aruuuga " ;
	    String key = " 1234 " ; 
	   //Top speed
	    // Speed
		 //FuelLevel
		   
		   
		
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
		    String hornSound = " aruuuga " ;
			 String key = " 1234 " ;
			  topSpeed = 140 ; 
			   speed = 0 ;
			    fuelLevel = 5 ;
			 
			 }
			 
		// This is the no parameter constructor 	   
			   Vehicle() {
			  passengers = 1;
			 fuelcap = 22;
			mpg =  	21;
		   doors = 4 ;
		    tireSize = 33;
		     weight = 3600;
			  year = 2015 ;
			   totalmiles = 8;
			    color = "matte grey";
				  String hornSound = " aruuuga " ;
				   String key = " 1234 " ;
				   topSpeed = 140 ; 
				  speed = 0 ;
				 fuelLevel = 5 ;
			}
	
		// 9 parameter constructor 
		
			Vehicle( int d, int t, int w, int y, int z, String c, int p, int f, int m,  String h, String k, int ts, int s, int l )
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
			 hornSound = h ;
			  key = k ;
			  topSpeed = ts ;
			   speed = s;
			    fuelLevel = l; 
					d = 4;
					 t = 33;
					  w = 3600;
					   y = 2015;
						z = 8;
						 c = "matte grey" ;
						  p = 4;
						   f = 22;
						    m = 21;
							 h =  " aruuuga "; 
							  k = " 1234 " ;
							 ts = 140 ; 
							s = 0 ; 
						   l = 5 ; 
						   
				}
				
public boolean startCar(String newKey) {
			if(newKey == key)
			{
				System.out.println("Key match, started");
				 return true ;
			}
			else
			{
				System.out.println("Key does not match, start failed") ; 
				return false ;
			}
}
			
			// Return the range.
				int range() {
				 return mpg * fuelcap;
		}
		
			String accelerate() {
			 String motion = "Accelerating...";
			   return motion; 
			 }
		
			String brake() {
			  String motion = "slowing down...";
			   return motion; 
			}
			
			String hornSound() {
			  String motion = hornSound ;
			   return motion; 
		
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
			Vehicle minivan = new Vehicle(6,17,15) ;
			 Vehicle sportscar = new Vehicle (2,15,18) ;
			   String hornSound = " aruuuga " ;
			    
			  double gallons;
			   double refillnumber;
			    int dist = 252; 
			     gallons = minivan.fuelneeded(dist); 
				 
				
				 
				 
				 
			
			   System.out.println(" to go "  +  dist  +  " miles minivan needs " +  gallons +  " gallons of fuel. "  );
				gallons = sportscar.fuelneeded(dist);
			
			     System.out.println(" To go " + dist +  " miles sportscar needs " +  gallons + " gallons of fuel. ") ;
		          gallons = minivan.fuelneeded(dist); 
			
			        System.out.println (" To go " + dist  + " the minivan will use up " +  minivan.refuel(dist) + " of tank." );
			
			         System.out.println (" To go " + dist  + " the sportscar will use up " +  sportscar.refuel(dist) + " of tank.") ;
					 
					   
					   
				
					  System.out.println(minivan.hornSound()) ; 	//CHARLES ADDED				  
					  System.out.println(hornSound) ; 
					 
					   System.out.println(minivan.brake()) ; //CHARLES ADDED
			 
						System.out.println(minivan.startCar("this key") ? "woot woot you win" : "Bum bum bummmmm you fail"); //CHARLES ADDED

						System.out.println(minivan.startCar(" 1234 ") ? "woot woot you win" : "Bum bum bummmmm you fail"); //CHARLES ADDED
		
				}
			
			}
			
			
			
			