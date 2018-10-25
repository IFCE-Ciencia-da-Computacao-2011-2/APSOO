package factory.simple.pizza;

import factory.OptionPizza;
import factory.Pizza;

public class ClamPizza extends Pizza {
	public ClamPizza() {
		super(OptionPizza.ClamPizza.toString());
	}
}
