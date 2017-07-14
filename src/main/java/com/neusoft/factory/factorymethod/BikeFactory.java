package com.neusoft.factory.factorymethod;

public class BikeFactory implements CarFactory{

	@Override
	public Car getCar() {
		return new Bike();
	}

}
