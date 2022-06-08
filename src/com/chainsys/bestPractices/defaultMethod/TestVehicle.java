package com.chainsys.bestPractices.defaultMethod;

public class TestVehicle {
	public static void main(String[] args) {
		Car firstCar=new Car();
		firstCar.start();
		firstCar.move();
		
		Bike firstBike = new Bike();
		firstBike.move();
		firstBike.start();
		
		Lorry firstLorry = new Lorry();
		firstLorry.move();
		firstLorry.start();
	}

}
