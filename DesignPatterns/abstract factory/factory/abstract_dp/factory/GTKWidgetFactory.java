package factory.abstract_dp.factory;

import factory.abstract_dp.widget.button.Button;
import factory.abstract_dp.widget.button.GTKButton;
import factory.abstract_dp.widget.scrollbar.GTKScrollbar;
import factory.abstract_dp.widget.scrollbar.ScrollBar;
import factory.abstract_dp.widget.window.GTKWindow;
import factory.abstract_dp.widget.window.Window;

public class GTKWidgetFactory extends WidgetFactory {

	@Override
	public ScrollBar createScroolBar() {
		return new GTKScrollbar();
	}

	@Override
	public Window createWindow() {
		return new GTKWindow();
	}

	@Override
	public Button createButton() {
		return new GTKButton();
	}
}
