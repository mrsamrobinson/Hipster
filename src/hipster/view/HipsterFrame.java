package hipster.view;

import hipster.controller.HipsterController;

import javax.swing.JFrame;

public class HipsterFrame extends JFrame
{
	/**
	 * Creates a reference to baseController.
	 */
	private HipsterController baseController;

	/**
	 * Creates a new HipsterPanel named basePanel.
	 */
	private HipsterPanel basePanel;

	public HipsterFrame(HipsterController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);

		setupFrame();
	}

	/**
	 * Sets up the JFrame.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(450, 450);
		this.setVisible(true);
	}

}
