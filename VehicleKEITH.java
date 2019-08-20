import java.util.Scanner; 
class Vehicle 
{
//Here we declare the variable for our Vehicle class	
	String vehicleName;
	String color;
	String hornSound;
	String key;
	int passengers;
	int fuelCap;
	int mpg;
	int doors;
	int tireSize;
	int tonage;
	int modelYear;
	int totalMiles;
	int dist;
	int topSpeed;
	int speed;
	int fuelLevel;
	

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
	
	public void setVehicle(String honk, String isKey, int tSp, int zoom, int fL)
	{
		hornSound = honk;
		key = isKey;
		topSpeed = tSp;
		speed = zoom;
		fuelLevel = fL;
	}
	
	public void getVehicle()
	{
		System.out.println(hornSound + " " + key + " is in the ignition." + " You are currently going " + speed + "." + " Your top speed is " + topSpeed + " and you have " + fuelLevel + " gallons of fuel left.");
	}
	
//This section contains our methods for car functions, computing math and returning values to be used	 
	int range() //int fuelCap int mpg
	{
		return mpg * fuelCap; 
	}
	int range(int m, int fC) //int fuelCap int mpg
	{
		return m * fC; 
	}
	
	double fuelNeeded(int dist) //int dist int mpg
	{
		return (double) dist / mpg;
	}
	double fuelNeeded(int d, int m) //int dist int mpg
	{
		return (double) d / m;
	}
	
	int refill() // int dist int range
	{
		int refuel = dist/mpg;
		return refuel/ fuelCap + 1;
	}
	int refill(int d, int m, int fC) // int dist int range
	{
		int refuel = d/m;
		return refuel/ fC + 1;
	}
	public String honkHorn()
	{
		String honking = "BEEP! BEEP!";
		return honking;
	}
	public String accelerate()
	{
		String motion = "Accelerating...";
		return motion;
	}
	public String brake()
	{
		String braking = "Brake check! Slowing down...";
		return braking;
	}
	public boolean start(String usedKey)
	{
		if (usedKey == key)
		{
			System.out.println("Starting engine...");
			return true;
		}
		else 
		{
			System.out.println("That's not the right key!");
			return false;
		}
	}
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
			defaultVehicle.setVehicle("HONK! HONK!", "key", 100, 55, 10);
			defaultVehicle.getVehicle();
			
//These constructors creates a new object of our Vehicle class using pre-defined variables from our overloaded constructor which are declared here by the developer
//With 3 parameters
			Vehicle developer3PVehicle = new Vehicle(4, 30, 18);
//With 9 parameters
/*
			Vehicle developer9PVehicle = new Vehicle("White", 7, 16, 21, 4, 18, 7000, 1999, 5000);
			Vehicle truck = new Vehicle("Black", 5, 24, 15, 4, 24, 5000, 2019, 500);
			Vehicle sedan = new Vehicle("Blue", 5, 16, 26, 4, 18, 2000, 2019, 500);
			Vehicle sportscar = new Vehicle("Red", 2, 16, 13, 2, 17, 2500, 2019, 500);
			Vehicle motorcyle = new Vehicle("Yellow", 1, 9, 21, 4, 15, 300, 2019, 500);
*/			
/*	Includes car name. 10 parameters		
			Vehicle developerVehicle = new Vehicle ("minivan", "White", 7, 16, 21, 4, 18, 7000, 1999, 5000) ;
	*/		
		
		}
	}
	
	