package com.neusoft.factory.factorymethod;

public class BusFactory implements CarFactory{

	@Override
	public Car getCar() {
		return new Bus();
	}

}
