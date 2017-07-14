package com.neusoft.factory.factorymethod;
/**
 * 工厂方法模式：
 * 类的创建模式，定义一个创建对象的工厂接口，将实际的创建工作推迟到工厂子类中。
 * 工厂方法模式是简单工厂模式的进一步抽象和推广，弥补简单工厂模式不满足开闭原则(OCP)的缺陷。
 * 工厂父类（接口）负责定义产品对象的公共接口，而子类工厂则负责创建具体的产品对象。
 * @author daibiao
 *
 */
public interface CarFactory {
	public Car getCar();
}
