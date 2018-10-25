package factory.method.franchise;

import factory.OptionPizza;
import factory.Pizza;
import factory.method.HighTechPizzaStore;
import factory.method.pizza.fortaleza.CheesePizzaFortaleza;
import factory.method.pizza.fortaleza.ClamPizzaFortaleza;
import factory.method.pizza.fortaleza.PepperoniPizzaFortaleza;
import factory.method.pizza.fortaleza.VeggiePizzaFortaleza;

public class HighTechPizzaStoreFortaleza extends HighTechPizzaStore {

	@Override
	protected Pizza createPizza(OptionPizza option) {
		if (option == OptionPizza.CheesePizza)
			return new CheesePizzaFortaleza();
		else if (option == OptionPizza.VeggiePizza)
			return new VeggiePizzaFortaleza();
		else if (option == OptionPizza.ClamPizza)
			return new ClamPizzaFortaleza();
		else if (option == OptionPizza.PepperoniPizza)
			return new PepperoniPizzaFortaleza();
		else
			return new Pizza("Custom pizza - Fortaleza") {};
	}

}
