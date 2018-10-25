package factory.abstract_dp.factory;

import factory.abstract_dp.widget.button.Button;
import factory.abstract_dp.widget.scrollbar.ScrollBar;
import factory.abstract_dp.widget.window.Window;

public abstract class WidgetFactory {
	public abstract ScrollBar createScroolBar();
	public abstract Window createWindow();
	public abstract Button createButton();
}
