package factory.method.franchise;

import factory.OptionPizza;
import factory.Pizza;
import factory.method.HighTechPizzaStore;
import factory.method.pizza.maracanau.CheesePizzaMaracanau;
import factory.method.pizza.maracanau.ClamPizzaMaracanau;
import factory.method.pizza.maracanau.PepperoniPizzaMaracanau;
import factory.method.pizza.maracanau.VeggiePizzaMaracanau;

public class HighTechPizzaStoreMaracanau extends HighTechPizzaStore {

	@Override
	protected Pizza createPizza(OptionPizza option) {
		if (option == OptionPizza.CheesePizza)
			return new CheesePizzaMaracanau();
		else if (option == OptionPizza.VeggiePizza)
			return new VeggiePizzaMaracanau();
		else if (option == OptionPizza.ClamPizza)
			return new ClamPizzaMaracanau();
		else if (option == OptionPizza.PepperoniPizza)
			return new PepperoniPizzaMaracanau();
		else
			return new Pizza("Custom pizza - Maracas city") {};
	}

}
