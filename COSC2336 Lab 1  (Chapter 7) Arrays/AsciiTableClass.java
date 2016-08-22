/**
 * @(#)AsciiTableClass.java
 *
 *
 * @author Snowfoxs
 * @version 1.00 2016/1/20
 */
import java.util.Scanner;

public class AsciiTableClass
{
	// Fields
	private int length;
	private String userInput;
	private char[] userArray;
	private final int[] ASCII_TABLE = {97,98,99,100,101,102,103,104,105,106,107,
		108,109,110,111,112,113,114,115,116,117,118,119,120,121,122};
	private final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
	private final char[] CHAR_TABLE = CHARACTERS.toCharArray();
	private final String REGEX = "^[a-z]+$";


	/**
	Constructor which accepts values as arguments and assigns them to the
	corresponding fields.
	*/
	public AsciiTableClass()
	{
		userInput = "a";
		length = 1;
	}

	/**
	Gets the user's input
	@return returns the user's input
	*/
	public String getUserInput()
	{
		String input;

		Scanner keyboard = new Scanner (System.in);
		System.out.println("Please some lowercase letters: ");
		input = keyboard.nextLine();
		System.out.println("\nInput: "+input);

		while (!input.matches(REGEX))
		{
			System.out.println("Illegal Character! Only use lowercase!");
			System.out.println("Try again...");
			input = keyboard.nextLine();
			System.out.println("\nInput: "+input);
		}
		return input;
	}

	public String setUserInput(String sentInput)
	{
		String goodInput = "badinput";

		if (!sentInput.matches(REGEX))
		{
			System.out.println("\nIllegal Character! Only use lowercase!");
			System.out.println("SETTING USER INPUT TO \"badinput\" due to an" +
			" error!");
			System.out.println("USER ENTERED: \"" + sentInput + "\"");
		} else
		{
			goodInput = sentInput;
		}

		return goodInput;
	}

	/**
	Determines length of users input
	@param user's unput
	@return length of input
	*/
	public int countInput(String userInput)
	{
		int length = userInput.length();
		return length;
	}

	/**
	Converts user's input to a character array
	@param user's input
	@return character array from input
	*/
	public char[] convertInput(String userInput)
	{
		char[] userArray = userInput.toCharArray();
		return userArray;
	}

	/**
	Matches the user's character array to the constant character array (a-z)
	and returns an array of the indexes at which the users input is located
	@param the user's character array
	@param the length of the user's array
	@return returns an array of indexes for the charArray and ASCII_TABLE arrays
	*/
	public int[] matchMachine(char[] userArray, int length)
	{
		int increment = 0;
		char charToCheck = 'a';
		int foundAt = 0;
		int[] finalizedIndex = new int[length];

		for (int i = 0; i < length; i++)
		{
			charToCheck = userArray[i];

			do 
			{
				if (charToCheck != CHAR_TABLE[increment])
				{
					increment++;
					if (increment > 25)
					{
						System.out.println("ERROR! You must enter lowercase" +
							" letters only!");
					}
				} else 
				{
					// System.out.println("Found at index: " + increment);
					finalizedIndex[i] = increment;
					increment = 0;
					break;
				}
			} while (length >= i);
		}

		return finalizedIndex;
	}

	/**
	Prints the results from matchMachine in a readable manor
	@param the user's input array
	@param the length of the user's array
	*/

	public void printIndexs(char userArray[], int length)
	{
		int[] finalizedIndex = matchMachine(userArray, length);

		System.out.println("\nFinalized Indexes: ");

		for (int i = 0; i < length; i++)
		{
			System.out.println(CHAR_TABLE[finalizedIndex[i]] + "\t" +
				 ASCII_TABLE[finalizedIndex[i]]);
		}
	}
}
