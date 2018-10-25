package factory.simple.pizza;

import factory.OptionPizza;
import factory.Pizza;

public class VeggiePizza extends Pizza {
	public VeggiePizza() {
		super(OptionPizza.VeggiePizza.toString());
	}
}
