package prabu.prgms.sample;

public class Mthdovr {

	public void drive() {
		System.out.println("Driving vehicle ...");
	}
}

class Car1 extends Mthdovr {
	@Override
	public void drive() {
		System.out.println("Driving Car ...");
	}
}

class Truck extends Mthdovr {
	@Override
	public void drive() {
		System.out.println("Driving truck...");
	}

	public void load() {
		System.out.println("Loading truck...");
	}

	public void drive1() {
		super.drive();
	}

	public static void main(String[] args) {
		Mthdovr vehicle = new Mthdovr();
		vehicle.drive();

		Mthdovr carVehicle = new Car1();
		carVehicle.drive();

		Mthdovr truckVehicle = new Truck();
		truckVehicle.drive();
		// Compile time error
		// truckVehicle.load();
		Truck truck = new Truck();
		truck.load();

		Truck truck1 = new Truck();
		truck1.drive1();

	}
}
