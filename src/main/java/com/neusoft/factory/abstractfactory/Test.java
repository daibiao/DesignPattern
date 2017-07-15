package com.neusoft.factory.abstractfactory;

public class Test {
	public static void main(String[] args) {
		AbstractFactory af1=new Product1Factory();
		product(af1);
		AbstractFactory af2=new Product2Factory();
		product(af2);
	}
	public static void product(AbstractFactory af) {
		af.getProductA().useA();
		af.getProductB().useB();
	}
}
