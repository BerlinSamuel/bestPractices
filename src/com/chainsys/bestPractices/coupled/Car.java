package com.chainsys.bestPractices.coupled;
//Objects of this class can wok only with PetrolEngine and SteelWheel
//The car class is tightly coupled with PetrolEngine Class and SteelWheel class
public class Car {
	private PetrolEngine engine; //early bound with petrol engine
	private SteelWheel[] wheels; //early bound with steel wheel
	
public Car() {
	engine=new PetrolEngine();
	wheels= new SteelWheel[4];
	wheels[0]= new SteelWheel();
	wheels[0].location= "Front left";
	wheels[1]= new SteelWheel();
	wheels[1].location= "Front right";
	wheels[2]= new SteelWheel();
	wheels[2].location= "Back left";
	wheels[3]= new SteelWheel();
	wheels[3].location= "Back left";

}
public Car(PetrolEngine engine,SteelWheel[] wheel) {
	this.engine=engine;
	this.wheels=wheel;
	wheels[0].location= "Front left";
	wheels[1].location= "Front right";
	wheels[2].location= "Back left";
	wheels[3].location= "Back left";

}
public void startCar() {
	  engine.start();
	   wheels[0].rotate();
	   wheels[1].rotate();
	   wheels[2].rotate();
	   wheels[3].rotate();
}
public SteelWheel[] getWheels() {
	return this.wheels;
}
}
