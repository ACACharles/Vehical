package vehicle;

public abstract class Vehicle {
	
	
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
						int range(int m, int c) {
						 return m * c ; 
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
					double fuelneeded (int d, int m) 
			{
						return (double)  d /  m ; 
			}
					
					double refuel (int miles)
					{
				      return (double) miles / (mpg * fuelcap) ; 
			}
					double refuel ( int miles, int d , int r )
					{ 
						return (double) miles / ( d *  r);
					}
			 
			


			
				abstract void getMakeandModel(); 
				
				
				
				
				
	}		
				


