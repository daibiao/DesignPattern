package com.neusoft.factory.factorymethod;

public class Bike implements Car{

	@Override
	public void go() {
		System.out.println("骑自行车出门");
	}

}
