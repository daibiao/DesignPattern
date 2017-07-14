package com.neusoft.factory.factorymethod;

public class Bus implements Car{

	@Override
	public void go() {
		System.out.println("坐公交车出门");
	}

}
