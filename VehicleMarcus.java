class Vehicle {
	int passengers; // number of passengers 
	int fuelcap;    // fuel capacity in gallons
	int mpg;		// fuel consumption in gallons
	int doors;      // numbers of doors
	int tiresize;  // size of tires in inches
	String color;   // color of car
	int weight;     // weight of car in lbs
	int year;       // year car was made
	int totalmiles; // mileage car has
	
		// Return gas refill
		double refill(double gallonsfortrip) {
			return (double) gallonsfortrip / fuelcap; // the word gallonsfortrip doesn't make a difference what it is
			}
	    }
			
	class VehicleMarcus {
	  public static void main(String[] args) {
	    Vehicle camaro = new Vehicle();
		int gallons = 21;
		int dist = 252;
		double refill;
		
		//assign info to Camaro
		camaro.passengers = 2;
		camaro.fuelcap = 14;
		camaro.mpg = 12;
		camaro.doors = 2;
		camaro.tiresize = 18;
		camaro.color = "blue";
		camaro.weight = 3000;
		camaro.year = 2055;
		camaro.totalmiles = 6;
		
		refill = camaro.refill(gallons);
		
		System.out.println(" You will need to refill  " + refill + " " + "times" + " to drive your Camaro " + dist + " " + "miles.");
		}
	}