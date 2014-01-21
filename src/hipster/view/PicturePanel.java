package hipster.view;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * JPanel that holds an image.
 * @author Sam Robinson
 * @version 1.1 11/26/13 Added declaration, constructor, and helper methods. Added documentation comments.
 */
public class PicturePanel extends JPanel
{
	/**
	 * Creates a new Image named baseImage.
	 */
	private Image baseImage;
	/**
	 * Creates a new ImageIcon named pictureSource.
	 */
	private ImageIcon pictureSource;
	/**
	 * Creates a new int named width.
	 */
	private int width;
	/**
	 * Creates a new int named height.
	 */
	private int height;
	
	/**
	 * Sets the source for the ImageIcon.
	 * @param imagePath a URL for the source of the Image.
	 */
	public void setPictureSource(URL imagePath)
	{
		this.pictureSource = new ImageIcon(imagePath);
	}

	/**
	 * Initializes the each of the values.
	 * @param imagePath the image source.
	 * @param width the width of the panel.
	 * @param height the height of the panel.
	 */
	public PicturePanel(URL imagePath, int width, int height)
	{
		this.width = width;
		this.height = height;
		this.pictureSource = new ImageIcon(imagePath);
	}
	
	/**
	 * Sets the properties and coordinates of the image.
	 */
	@Override
	protected void paintComponent(Graphics panelGraphics)
	{
		super.paintComponent(panelGraphics);
		baseImage = pictureSource.getImage();
		panelGraphics.drawImage(baseImage, 0, 0, width, height, null);
	}

}
