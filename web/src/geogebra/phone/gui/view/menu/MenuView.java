package geogebra.phone.gui.view.menu;

import geogebra.html5.main.AppW;
import geogebra.phone.gui.view.AbstractView;
import geogebra.phone.gui.view.HeaderPanel;
import geogebra.phone.gui.view.StyleBarPanel;
import geogebra.phone.gui.view.ViewPanel;
import geogebra.web.css.GuiResources;

import com.google.gwt.resources.client.ImageResource;

public class MenuView extends AbstractView {

	public MenuView(AppW app) {
		super(app);
	}

	@Override
	protected ViewPanel createViewPanel() {
		return new MenuViewPanel(app);
	}

	@Override
	protected ImageResource createViewIcon() {
		return GuiResources.INSTANCE.options();
	}

	@Override
	protected HeaderPanel createHeaderPanel() {
		return null;
	}

	@Override
	protected StyleBarPanel createStyleBarPanel() {
		return null;
	}
}
