package VehiclePack;

public class DemoVehicle {

	public static void main(String[] args) {
		
		Automobile truck = new Automobile();
		
		System.out.println(truck.passengers);
		System.out.println(truck.fuelLevel);
		System.out.println(truck.doors);
		System.out.println(truck.getNumWheels());
		System.out.println(truck.honk());

	}

}
