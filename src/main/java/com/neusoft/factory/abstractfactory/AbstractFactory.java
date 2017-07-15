package com.neusoft.factory.abstractfactory;
/**
 * 抽象工厂模式：
 * 提供一个接口，可以创建多个产品族中的产品对象。
 * 产品族：位于不同产品等级结构中，功能相关联的产品组成的家族。
 * 产品等级：由相同结构的产品组成。
 * 抽象工厂模式通常是用于创建一族产品，并且这族产品分不同的等级；不同的具体工厂类生产不同等级的一族产品。
 * @author daibiao
 *
 */
public interface AbstractFactory {
	public ProductA getProductA();
	public ProductB getProductB();
}
