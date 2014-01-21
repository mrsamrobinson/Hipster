package hipster.controller;

import javax.swing.JOptionPane;

import hipster.model.Hipster;
import hipster.view.HipsterFrame;

/**
 * Controller for the Hipster project.
 * 
 * @author Sam Robinson
 * @version 1.0 11/19/13 added Controller information. Added Hipsters.
 */
public class HipsterController
{
	/**
	 * Creates a HipsterFrame named 'appFrame';
	 */
	private HipsterFrame appFrame;
	
	/**
	 * Creates a Hipster named 'selfHipster';
	 */
	private Hipster selfHipster;
	
	/**
	 * Creates a Hipster Array named 'cubicalHipsters';
	 */
	private Hipster[] cubicalHipsters;
	
	/**
	 * Creates an int named 'hipsterCount';
	 */
	private int hipsterCount;

	public HipsterController()
	{
		selfHipster = new Hipster();
		cubicalHipsters = new Hipster[5];
		hipsterCount = 0;
	}

	/**
	 * Retrieves selfHipster.
	 * 
	 * @return selfHipster
	 */
	public Hipster getSelfHipster()
	{
		return selfHipster;
	}

	/**
	 * Changes selfHipster.
	 * 
	 * @param selfHipster
	 *            My Hipster-self.
	 */
	public void setSelfHipster(Hipster selfHipster)
	{
		this.selfHipster = selfHipster;
	}

	/**
	 * Getter for the Hipster[] named cubicalHipsters.
	 * @return cubicalHipsters.
	 */
	public Hipster[] getCubicalHipsters()
	{
		return cubicalHipsters;
	}

	/**
	 * Setter for cubicalHipsters.
	 * @param cubicalHipsters.
	 */
	public void setCubicalHipsters(Hipster[] cubicalHipsters)
	{
		this.cubicalHipsters = cubicalHipsters;
	}

	/**
	 * Used to start the application GUI for the Hipster program.
	 */
	public void start()
	{
		appFrame = new HipsterFrame(this);
	}

	/**
	 * Retrieves the Hipster from the specified position in the array.
	 * 
	 * @param position
	 *            The location in the array. It must be between 0 and
	 *            cubicalHipsters.length.
	 * @return The Hipster at the position in the array.
	 */
	public Hipster getSpecifiedHipster(int position)
	{
		Hipster currentHipster = null;

		if (position < cubicalHipsters.length && position >= 0)
		{
			currentHipster = cubicalHipsters[position];
		}

		return currentHipster;
	}

	/**
	 * Used to retrieve a random Hipster object from the array of class
	 * Hipsters.
	 * 
	 * @return the Hipster object.
	 */
	public Hipster getRandomHipster()
	{
		Hipster currentHipster = null;

		int randomIndex = 0;
		double random = Math.random();
		randomIndex = (int) (random * cubicalHipsters.length);
		currentHipster = cubicalHipsters[randomIndex];

		return currentHipster;
	}

	/**
	 * Creates and adds a Hipster to the array of cubical Hipsters from the
	 * specified values
	 * 
	 * @param books String[] of the hipster's books.
	 * @param name String of the name of the hipster.
	 * @param type The type of hipster.
	 * @param phrase The hipster's phrase.
	 */
	public void addHipster(String[] books, String name, String type,
			String phrase)
	{
		if (hipsterCount < cubicalHipsters.length)
		{
			Hipster tempHipster = new Hipster(name, type, phrase, books);
			cubicalHipsters[hipsterCount] = tempHipster;
			hipsterCount++;
		}
		else
		{
			JOptionPane.showMessageDialog(appFrame,
					"The class is full you are too mainstream to be added");
		}

	}

}
