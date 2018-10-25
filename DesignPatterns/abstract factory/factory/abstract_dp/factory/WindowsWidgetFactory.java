package factory.abstract_dp.factory;

import factory.abstract_dp.widget.button.Button;
import factory.abstract_dp.widget.button.WindowsButton;
import factory.abstract_dp.widget.scrollbar.ScrollBar;
import factory.abstract_dp.widget.scrollbar.WindowsScrollbar;
import factory.abstract_dp.widget.window.Window;
import factory.abstract_dp.widget.window.WindowsWindow;

public class WindowsWidgetFactory extends WidgetFactory {

	@Override
	public ScrollBar createScroolBar() {
		return new WindowsScrollbar();
	}

	@Override
	public Window createWindow() {
		return new WindowsWindow();
	}

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

}
