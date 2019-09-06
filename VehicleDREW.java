package vehDrew;

import java.util.Scanner;


class VehicleDREW
{
	public static void main(String[] args)
	throws java.io.IOException
	{
		Scanner input = new Scanner(System.in);
		Vehicle motorcycle= new Vehicle();
		Vehicle corvette= new Vehicle(2, 15, 20);
		Vehicle minivan = new Vehicle(7, 16, 21, 4, "Red", 2500, 2000, 50000, 40, 100, 0, "Hoot", "123456", "Full");
		Vehicle sportscar= new Vehicle(2, 14, 12, 2, "Blue", 2000, 2018, 2000, 40, 120, 0, "Beep", "123456", "Full");
		double gallons;
		int refill;
		int dist=0;
		int oil;
		/*
		System.out.print("\nHow many miles do you want to travel? Please enter here: ");
		
		one: if (input.hasNextInt())
		{
			dist = input.nextInt();
		}
		else
		{	
		System.out.println("That is not a number, try again: ");
		 break one;
		}
		
		gallons = minivan.fuelneeded(dist);
		System.out.println("\nTo go " + dist + " miles the minivan needs " + gallons + " gallons of fuel.\n");

		gallons = sportscar.fuelneeded(dist);		
		System.out.println("To go " + dist + " miles the sportscar needs " + gallons + " gallons of fuel.\n");

		refill = minivan.refuel(dist);
		System.out.println("To go " + dist + " miles the minivan needs to refuel " + refill + " time(s).\n");
		
		refill = sportscar.refuel(dist);
		System.out.println("To go " + dist + " miles the sportscar needs to refuel " + refill + " time(s).\n");
		
		oil= minivan.oilchange(dist);
		System.out.println("To go " + dist + " miles the minivan will need " + oil + " oil change(s).\n");

		oil= sportscar.oilchange(dist);		
		System.out.println("To go " + dist + " miles the sportscar will need " + oil + " oil change(s).\n");
		
		//Testing the empty Constructor
		System.out.println("The motorcycle has a mpg of " + motorcycle.mpg + "\n");
		
		//Testing the constructor with 3 variables passed in
		gallons = (int) corvette.fuelneeded(dist);
		System.out.println("To go " + dist + " miles the corvette needs " + gallons + " gallons of fuel.\n");
		System.out.println("The corvette is the color " + corvette.color + "\n");
		*/
		
		//test the start method
		if (Vehicle.start(minivan.key))
			System.out.println("Car is started");
		else 
			System.out.println("Wrong key, car didnt start");
		
		//Testing horn
		System.out.println(Vehicle.honkHorn());
		
		//Testing setVehicle and getVehicle
		Vehicle testVehicle=new Vehicle();
		testVehicle.setVehicle("123456", "Hoot", 120, 0, "Full");
		testVehicle.getVehicle();
	}
}

//Part A completed.
//Part B plus bonus completed. 
