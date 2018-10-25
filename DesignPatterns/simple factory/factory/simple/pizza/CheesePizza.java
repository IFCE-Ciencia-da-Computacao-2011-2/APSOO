package factory.simple.pizza;

import factory.OptionPizza;
import factory.Pizza;

public class CheesePizza extends Pizza {
	public CheesePizza() {
		super(OptionPizza.CheesePizza.toString());
	}
}
