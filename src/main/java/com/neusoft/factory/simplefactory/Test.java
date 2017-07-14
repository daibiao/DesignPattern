package com.neusoft.factory.simplefactory;

public class Test {
	public static void main(String[] args) {
		Class<?> c = null;
		try {
			c = Class.forName("com.neusoft.simplefactory.Woman");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Human human = HumanFactory.createHuman(c);
		human.say();
	}
}
