package com.neusoft.simplefactory;

public class HumanFactory {
	private HumanFactory() {

	}

	public static Human createHuman(Class<?> c) {
		Human human = null;
		try {
			human = (Human) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return human;
	}
}
