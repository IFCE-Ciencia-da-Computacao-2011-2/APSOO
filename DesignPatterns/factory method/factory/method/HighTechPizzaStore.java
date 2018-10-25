package factory.method;

import factory.OptionPizza;
import factory.Pizza;

public abstract class HighTechPizzaStore {
	public Pizza orderPizza(OptionPizza option) {
		Pizza pizza = this.createPizza(option);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	protected abstract Pizza createPizza(OptionPizza option);
}
