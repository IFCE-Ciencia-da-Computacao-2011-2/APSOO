package factory.abstract_dp.widget.window;

import java.util.ArrayList;
import java.util.List;

import factory.abstract_dp.Drawable;

public class GTKWindow implements Window {

	private List<Drawable> elements;

	public GTKWindow() {
		this.elements = new ArrayList<>();
	}
	
	@Override
	public void draw() {
		System.out.println("Draw container: " + this.getClass().getName());
		
		for (Drawable element : elements) {
			element.draw();
			System.out.println("Draw child: " + element.getClass().getName());
		}
	}

	@Override
	public void add(Drawable drawable) {
		this.elements.add(drawable);
	}
}
