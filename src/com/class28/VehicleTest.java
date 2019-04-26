package com.class28;

public class VehicleTest {

public static void main(String[] args) {

	Car car=new BMW("bmw");
	car.drive();
	car.start();
	car.stop();
	BMW.displayTotalVehicles();
	
	System.out.println(Vehicle.vehicleCount);//every time we create an object of BMW, it calls the constructor where vehicleCount is contained
	
	new BMW("bmw");
	new Toyota("camry");
	Vehicle.displayTotalVehicles();
}
}