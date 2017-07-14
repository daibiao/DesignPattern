package com.neusoft.factory.factorymethod;

public class Test {
	public static void main(String[] args) {
		CarFactory cf=null;
		cf=new BikeFactory();
		cf.getCar().go();
		cf=new BusFactory();
		cf.getCar().go();
	}
}
