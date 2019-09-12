package VehiclePack;

import java.util.Scanner;

class VehicleCody extends Vehicle {

	public static void main(String[] args) {
		
		

		Vehicle default1 = new Vehicle(	);
		
		System.out.println("Default vehicle specs: \n" + "Total passenger count: " + default1.passengers + "\nFuelcap: "
				+ default1.fuelcap + " \nMpg: " + default1.mpg + "\n \n");

		System.out.println("MiniVan specs: ");
		Scanner specs = new Scanner(System.in);
		System.out.print("Total passenger count-");
		int p = specs.nextInt();
		System.out.print("\nFuel capcity-");
		int f = specs.nextInt();
		System.out.print("\nMPG-");
		int m = specs.nextInt();
		Vehicle minivan = new Vehicle(p, f, m);
		
		
		System.out.println("SportsCar specs: ");
		Scanner specs21 = new Scanner(System.in);
		System.out.print("Total passenger count-");
		 p = specs21.nextInt();
		System.out.print("\nFuel capcity-");
		f = specs21.nextInt();
		System.out.print("\nMPG-");
		m = specs21.nextInt();
		Vehicle sportscar = new Vehicle(p, f, m);
		

		double gallons;
		double refillnumber;
		int dist = 500;

		gallons = minivan.fuelneeded(dist);

		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel. To go " + dist
				+ " You will use up " + minivan.refuel(dist) + " of tank.");

		gallons = sportscar.fuelneeded(dist);

		System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel. To go " + dist
				+ " You will use up " + sportscar.refuel(dist) + " of tank.");

		System.out.println("To go " + dist + " You will use up " + minivan.refuel(dist) + " of tank.");

	}


}
