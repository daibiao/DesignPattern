package com.neusoft.factory.abstractfactory;

public class Product1Factory implements AbstractFactory{

	@Override
	public ProductA getProductA() {
		return new ProductA1();
	}

	@Override
	public ProductB getProductB() {
		return new ProductB1();
	}

}
