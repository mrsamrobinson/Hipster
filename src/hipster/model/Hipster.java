package hipster.model;

/**
 * Creates the Hipster object.
 * 
 * @author Sam Robinson
 * @version 1.3 20/11/13 Added getter/setters, overloaded constructor for
 *          additional hipsters, documentation comments.
 */
public class Hipster
{
	/**
	 * Creates a String named 'name'.
	 */
	private String name;
	
	/**
	 * Creates a String named 'hipsterType'.
	 */
	private String hipsterType;
	
	/**
	 * Creates a String named 'hipsterPhrase'.
	 */
	private String hipsterPhrase;
	
	/**
	 * Creates a String[] named 'hipsterBooks'.
	 */
	private String[] hipsterBooks;

	/**
	 * Creates a defaulst Hipster object with values based on me.
	 */
	public Hipster()
	{
		name = "Sam Robinson";
		hipsterType = "Sexy";
		hipsterPhrase = "Smack Dat, Let the bodies hit the floor.";
		hipsterBooks = new String[5];

		fillTheBooks();
	}

	/**
	 * Creates a Hipster Object with the specified parameters to fill in the
	 * component data members.
	 * 
	 * @param name
	 *            The name of the created Hipster.
	 * @param hipsterType
	 *            The type of the created Hipster.
	 * @param hipsterPhrase
	 *            The catch-phrase of this created Hipster.
	 * @param hipsterBooks
	 *            An array of books for the Hipster.
	 */
	public Hipster(String name, String hipsterType, String hipsterPhrase,
			String[] hipsterBooks)
	{
		this.name = name;
		this.hipsterBooks = hipsterBooks;
		this.hipsterPhrase = hipsterPhrase;
		this.hipsterType = hipsterType;
	}

	/**
	 * Getter method for the name of Hipster.
	 * 
	 * @return The Hipster name.
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Getter method for the type of Hipster.
	 * 
	 * @return The Hipster type.
	 */
	public String getHipsterType()
	{
		return hipsterType;
	}

	/**
	 * Getter method for the phrase of Hipster.
	 * 
	 * @return The Hipster phrase.
	 */
	public String getHipsterPhrase()
	{
		return hipsterPhrase;
	}

	/**
	 * Getter method for the Hipster books.
	 * 
	 * @return The Hipster books.
	 */
	public String[] getHipsterBooks()
	{
		return hipsterBooks;
	}

	/**
	 * Setter method to change the name.
	 * 
	 * @param name
	 *            The name of the Hipster.
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Setter method to change the HipsterType.
	 * 
	 * @param hipsterType
	 *            The type of hipster.
	 */
	public void setHipsterType(String hipsterType)
	{
		this.hipsterType = hipsterType;
	}

	/**
	 * Setter method to change the HipsterPhrase.
	 * 
	 * @param hipsterPhrase
	 *            phrase of the hipster.
	 */
	public void setHipsterPhrase(String hipsterPhrase)
	{
		this.hipsterPhrase = hipsterPhrase;
	}

	/**
	 * Setter method to change the hipsterBooks.
	 * 
	 * @param hipsterBooks
	 *            books of the hipster.
	 */
	public void setHipsterBooks(String[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}

	/**
	 * Fills the hipsterBooks Array.
	 */
	private void fillTheBooks()
	{
		hipsterBooks[0] = "Dictionary";
		hipsterBooks[1] = "1984";
		hipsterBooks[2] = "Charlotte's Web";
		hipsterBooks[3] = "The Cat in the Hat";
		hipsterBooks[4] = "The Bro Code";
	}

}
