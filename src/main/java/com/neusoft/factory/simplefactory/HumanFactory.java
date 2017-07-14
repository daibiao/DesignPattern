package com.neusoft.factory.simplefactory;
/**
 * 简单工厂模式（简单静态工厂模式）：
 * 建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
 * 简单工厂模式的实质是由一个工厂类根据传入的参数，动态决定应该创建哪一个产品类（这些产品类继承自一个父类或接口）的实例。
 * @author daibiao
 *
 */
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
