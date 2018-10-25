package factory.simple;

import factory.Pizza;
import factory.simple.pizza.CheesePizza;
import factory.simple.pizza.ClamPizza;
import factory.simple.pizza.PepperoniPizza;
import factory.simple.pizza.VeggiePizza;
import factory.OptionPizza;

public class SimplePizzaFactory {
	
	Pizza createPizza(OptionPizza option) {
		Pizza pizza;
		if (option == OptionPizza.CheesePizza)
			pizza = new CheesePizza();
		else if (option == OptionPizza.VeggiePizza)
			pizza = new VeggiePizza();
		else if (option == OptionPizza.ClamPizza)
			pizza = new ClamPizza();
		else if (option == OptionPizza.PepperoniPizza)
			pizza = new PepperoniPizza();
		else {
			pizza = new Pizza("Custom pizza") {};
		}
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
}
