package factory.simple;

import factory.OptionPizza;

public class PizzaStore {
	private SimplePizzaFactory factory;

	public PizzaStore() {
		this.factory = new SimplePizzaFactory();
	}
	
	public void orderPizza(OptionPizza option) {
		this.factory.createPizza(option);
	}
}
