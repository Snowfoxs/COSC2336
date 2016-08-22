/**
 * @(#)StringAsciiClass.java
 *
 *
 * @author Snowfoxs
 * @version 1.00 2016/2/10
 */

public class StringAsciiClass
{
	// Fields
	private String userInput;
	private final int[] ASCII_TABLE = {97,98,99,100,101,102,103,104,105,106,107,
		108,109,110,111,112,113,114,115,116,117,118,119,120,121,122};
	private final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
	private final String MISTER_CLEAN = "[^\\p{Alpha}]";
	private HashTable hashTable = new HashTable();
	private final int CONVERSION_NUMBER = 97; 

	/**
	No arg constructor
	*/
	public StringAsciiClass()
	{

	}

	/**
	Method which sends the input string to cleanMachine to be processed
	@param the string to input
	*/
	public void setUserInput(String sentInput)
	{
		userInput = cleanMachine(sentInput);
	}

	/**
	Method which prepares the string. Erases all non-alpha characters, and
	changes uppercase to lowercase.
	@param the string to be processed
	@return the processed string
	*/
	public String cleanMachine(String dirtyString)
	{
		String somewhatCleanString;
		String superCleanString;
		somewhatCleanString = dirtyString.replaceAll(MISTER_CLEAN, "");
		superCleanString = somewhatCleanString.toLowerCase();
		System.out.println("Cleaned: " + dirtyString + " --> " + 
			superCleanString);

		return superCleanString;
	}
	/**
	This method figures out where characters are on the ascii table
	@param the users input
	@return array of ascii values
	*/
	public int[] matchMachine(String sentInput)
	{
		setUserInput(sentInput);
		int increment = 0;
		int foudAt = 0;
		int[] finalIndex = new int[userInput.length()];

		for (int i = 0; i < userInput.length(); i++)
		{
			do
			{
				if (userInput.charAt(i) != 
					CHARACTERS.charAt(increment))
				{
					increment++;
					if (increment > 25)
					{
						System.out.println("Oh dear... Something has gone " +
							"terribly wrong...");
					}
				} else 
				{
					finalIndex[i] = increment;
					// System.out.println("Found at index: " + finalIndex[i]);
					increment = 0;
					break;
				}
			} while (userInput.length() >= i);
		}
		return finalIndex;
	}

	/**
	This method gets user input, and sends it to matchMachine to be processed
	finally it outputs the hashtable, after sending the appropriate data
	@param The users input
	*/
	public void printIndexes(String sentInput)
	{
		int[] asciiArray = matchMachine(sentInput);
		int[] asciiHash = new int[userInput.length()];

		for (int j = 0; j < userInput.length(); j++)
		{
			asciiHash[j] = ASCII_TABLE[asciiArray[j]];
		}

		hashTable.addHashToTable(asciiHash);
		hashTable.addStringToTable(userInput);

		/*System.out.println("\nFinalized Indexes: ");

		for (int i = 0; i < userInput.length(); i++)
		{
			System.out.println(userInput.charAt(i) + "\t" + 
				ASCII_TABLE[asciiArray[i]]);
		} */

	}

	/**
	This method prints the hashtable
	*/
	public void printHashTable()
	{
		hashTable.displayHashTable();
	}
}