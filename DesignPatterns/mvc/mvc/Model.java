package mvc;

import java.util.ArrayList;
import java.util.List;

public abstract class Model {
	private List<Observer> observers;

	public Model() {
		observers = new ArrayList<>();
	}
	
	public void attach(Observer observer) {
		this.observers.add(observer);
	}
	
	public void deattach(Observer observer) {
		this.observers.add(observer);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers)
			observer.update();
	}
}
