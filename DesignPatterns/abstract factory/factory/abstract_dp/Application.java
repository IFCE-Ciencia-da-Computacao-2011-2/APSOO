package factory.abstract_dp;

import factory.abstract_dp.factory.GTKWidgetFactory;
import factory.abstract_dp.factory.WidgetFactory;
import factory.abstract_dp.factory.WindowsWidgetFactory;
import factory.abstract_dp.widget.window.Window;

public class Application {
	
	private WidgetFactory factory;

	public Application() {
		this.factory = createWidgetFactory();
	}
	
	private WidgetFactory createWidgetFactory() {
		String os = System.getProperty("os.name");
		
		if (os.equals("Linux"))
			return new GTKWidgetFactory();
		else
			return new WindowsWidgetFactory();
	}
	
	private void start() {
		Window window = this.factory.createWindow();
		window.add(this.factory.createScroolBar());
		window.add(this.factory.createButton());
		window.add(this.factory.createButton());
		window.draw();
	}
	
	public static void main(String[] args) {
		Application app = new Application();
		app.start();
	}
}
