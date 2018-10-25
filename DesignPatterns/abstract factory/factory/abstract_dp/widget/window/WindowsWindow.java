package factory.abstract_dp.widget.window;

import java.util.ArrayList;
import java.util.List;

import factory.abstract_dp.Drawable;

public class WindowsWindow implements Window {

	private List<Drawable> elements;

	public WindowsWindow() {
		this.elements = new ArrayList<>();
	}
	
	@Override
	public void draw() {
		for (Drawable element : elements) {
			element.draw();
			System.out.println("Draw " + element.getClass().getName());
		}
	}

	@Override
	public void add(Drawable drawable) {
		this.elements.add(drawable);
	}
}
