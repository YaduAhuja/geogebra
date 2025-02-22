package org.geogebra.web.full.gui.layout.panels;

import org.geogebra.web.full.gui.layout.DockPanelW;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RequiresResize;

/**
 * Inner panel for dock panels with navigation.
 */
public class InnerPanel extends FlowPanel implements RequiresResize {

	private Panel content;
		private DockPanelW dock;

	/**
	 * @param dock
	 *            parent dock
	 * @param cpPanel
	 *            content
	 */
	public InnerPanel(DockPanelW dock, Panel cpPanel) {
		this.content = cpPanel;
		this.dock = dock;
		add(cpPanel);
	}

	@Override
	public void onResize() {
		dock.resizeContent(content);
	}

}