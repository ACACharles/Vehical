import java.util.Scanner; 
class Vehicle 
{
//Here we declare the variable for our Vehicle class	
	String vehicleName;
	String color;
	int passengers;
	int fuelCap;
	int mpg;
	int doors;
	int tireSize;
	int tonage;
	int modelYear;
	int totalMiles;
	int dist;

	double gallons;		
//Default values to be passed in when contructing a new object. Takes no parameters
	Vehicle()
	{	
		String vehicleName = "Sedan";
		String color = "Blue";
		passengers = 4;
		fuelCap = 16;
		mpg = 22;
		doors = 4;
		tireSize = 16;
		tonage = 5000;
		modelYear = 2010;
		dist = 500;
	}
//Variables to be passed into the constructor for developer input when constructing a new object. Contains 3 variables
	Vehicle(int p, int fc, int m)
	{
		passengers = p;
		fuelCap = fc;
		mpg =  m;
		color = "Blue";
		doors = 4;
		tireSize = 16;
		tonage =  5000;
		modelYear = 2010;
		dist = 500;
	}
	
//Variables to be passed into the constructor for developer input when constructing a new object. Contains 9 variables
	public Vehicle(String c, int p, int fc, int m, int d, int ts, int t, int my, int dis)
	{
		String color = c;
		passengers = p;
		fuelCap = fc;
		mpg =  m;
		doors = d;
		tireSize = ts;
		tonage =  t;
		modelYear = my;
		dist = dis;
	}
/*	Includes car name
	Vehicle(String vN, String c,int p, int fc, int m, int d, int ts, int t, int my, int dis)
	{
		String vehicleName = vN;
		String color = c;
		passengers = p;
		fuelCap = fc;
		mpg =  m;
		doors = d;
		tireSize = ts;
		tonage =  t;
		modelYear = my;
		dist = dis;
	}*/
	
//This section contains our methods for car functions, computing math and returning values to be used	 
	int range() 
	{
		return mpg * fuelCap; 
	}
	
	double fuelNeeded(int dist)
	{
		return (double) dist / mpg;
	}
	
	int refill()
	{
		int refuel = dist/mpg;
		return refuel/ fuelCap + 1;
	}
	
//Overloaded methods
	//int range(
}
class VehicleKEITH 
	{
		public static void main (String[] args)
		{
			Scanner input = new Scanner(System.in);
			
			System.out.println("\nWelcome to Keith's Auto Emporium.");
			System.out.println("        _______\r\n       //  ||\\ \\\r\n _____//___||_\\ \\___\r\n )  _          _    \\\r\n |_/ \\________/ \\___|\r\n___\\_/________\\_/______");
			System.out.println("");
//These create variables for constructor where user creates the variables for newly constructed object
			/*System.out.println("What type of vehicle would you like to create today?");
			String vehicleName = input.nextLine();*/
			
			System.out.println("What color would you like your vehicle to be?" );
			String color = input.nextLine();
			
			System.out.println("How many passengers can your vehicle carry?" );
			int passengers = input.nextInt();
			
			System.out.println("How many gallons of fuel can your vehicle hold?" );
			int fuelCap = input.nextInt();
			
			System.out.println("How many miles per gallon does your vehicle get?" );
			int mpg = input.nextInt();
			
			System.out.println("How many doors does your vehicle have?" );
			int doors = input.nextInt();
			
			System.out.println("What size tires does your vehicle have?" );
			int tireSize = input.nextInt();
			
			System.out.println("What is your vehicle's tonage?" );
			int tonage = input.nextInt();
			
			System.out.println("What model year is your vehicle?" );
			int modelYear = input.nextInt();
			
			System.out.println("How far would you like to go on your test run?" );
			int dist = input.nextInt();
			
//Constructor that creates new object of the class vehicle using the local variables from user input
			Vehicle userVehicle = new Vehicle(color, passengers, fuelCap, mpg, doors, tireSize, tonage, modelYear, dist);
			
//This constructor creates a new object of our Vehicle class using our preset variables declared within the Vehicle class
			Vehicle defaultVehicle = new Vehicle ();
			
//These constructors creates a new object of our Vehicle class using pre-defined variables from our overloaded constructor which are declared here by the developer
//With 3 parameters
			Vehicle developer3PVehicle = new Vehicle(4, 30, 18);
//With 9 parameters
			Vehicle developer9PVehicle = new Vehicle("White", 7, 16, 21, 4, 18, 7000, 1999, 5000);
			
/*	Includes car name. 10 parameters		
			Vehicle developerVehicle = new Vehicle ("minivan", "White", 7, 16, 21, 4, 18, 7000, 1999, 5000) ;
	*/		
		
		}
	}
	
	