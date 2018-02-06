package com.mysoft.builder;
/**
 * 该类用来指挥建造过程，可以达到建造顺序，建造的步骤每次建造都保持一致
 * @author xuchg1
 *
 */
public class Director {

	public void build(ProductBuilder builder){
		builder.buildA();
		builder.buildB();
	}
}
