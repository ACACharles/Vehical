import java.util.Scanner ; 
class Vehicle 
{
	String color ;
	
	int passengers ;
	int fuelcap ;
	int mpg ;
	int doors ;
	int tireSize ;
	int tonage ;
	int modelYear ;
	int dist ;
	
	
	int range() 
	{
		return mpg * fuelcap ; 
	}
	
	int refill()  //Must start with gas in tank
	{
		return dist / range() + 1 ;
	
	}
	
	double fuelNeeded(int miles)
	{
		return ( double ) miles / mpg ;
	}
}
class VehicleDemo 
	{
		public static void main ( String[] args )
		{
			Scanner input = new Scanner( System.in ) ;
			
			Vehicle minivan = new Vehicle () ;
			Vehicle sportscar = new Vehicle () ;
			
			System.out.print( "Enter a vehicle type: " ) ;
			Vehicle a = input.nextVehicle() ;
			a = new Vehicle () ;
			
			double gallons ;
			
			int range1, range2 ;
			
			minivan.passengers = 7 ;
			minivan.fuelcap = 16 ;
			minivan.mpg = 21 ;
			minivan.dist = 5000 ;
			
			
			sportscar.passengers = 2 ;
			sportscar.fuelcap = 14 ;
			sportscar.mpg = 12 ;
			
			System.out.println( "To complete trip tank must be filled " + minivan.refill() + " times" ) ;
			System.out.println( "Minivan can carry " + minivan.passengers + " with a range of " + minivan.range() + " miles. " ) ;
			
			
			System.out.print( "Sportscar can carry " + sportscar.passengers + " with a range of " + sportscar.range() + " miles. ") ;
			System.out.println( "To complete trip tank must be filled " + minivan.refill() + " times" ) ;
			
			//gallons = minivan.fuelNeeded( dist ) ;
		}
	}