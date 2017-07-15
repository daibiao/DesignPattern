package com.neusoft.factory.abstractfactory;

public class Product2Factory implements AbstractFactory{

	@Override
	public ProductA getProductA() {
		return new ProductA2();
	}

	@Override
	public ProductB getProductB() {
		return new ProductB2();
	}

}
